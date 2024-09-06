package org.mbds.unice.github.ui.users

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.mbds.unice.github.R
import org.mbds.unice.github.data.model.User
import org.mbds.unice.github.databinding.ActivityListUserBinding

class ListUserActivity : AppCompatActivity(), UserListAdapter.Listener {
    lateinit var recyclerView: RecyclerView
    lateinit var fab: FloatingActionButton
    private  lateinit var binding: ActivityListUserBinding

    // By lazy permet de faire du chargement parresseux,
    // L'adapteur sera crée au premier appel
    private val adapter: UserListAdapter by lazy {
        UserListAdapter(this)
    }

    private val viewModel: UserViewModel by lazy {
        ViewModelProvider(this)[UserViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configureFab()
        configureRecyclerView()
    }

    override fun onResume() {
        super.onResume()
        viewModel.users.observe(this) {
            adapter.updateList(it)
        }
    }

    private fun configureRecyclerView() {
        recyclerView = binding.activityListUserRv
        recyclerView.adapter = adapter
    }

    private fun configureFab() {
        fab = binding.activityListUserFab
        fab.setOnClickListener {
            viewModel.generateRandomUser()
        }
    }

    override fun onClickDelete(user: User) {
        Log.d("ERASINGUSER", " ${user.login} a été effacé")
        AlertDialog.Builder(this)
            .setTitle("Confirm Deletion")
            .setMessage("Are you sure you want to delete this user?")
            .setPositiveButton("Yes") { dialog, _ ->
                // User confirmed deletion
                viewModel.deleteUser(user) // Call method to delete the user
                dialog.dismiss() // Dismiss the dialog
            }
            .setNegativeButton("No") { dialog, _ ->
                // User cancelled the deletion
                dialog.dismiss() // Dismiss the dialog
            }
            .create()
            .show()
    }
}