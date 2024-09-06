package org.mbds.unice.github.ui.users

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.mbds.unice.github.R
import org.mbds.unice.github.data.model.User
import org.mbds.unice.github.databinding.ActivityListUserBinding
import org.mbds.unice.github.databinding.ItemListUserBinding


class ListUserViewHolder(private val binding: ItemListUserBinding) : RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("ResourceAsColor")
    fun bind(user: User, callback: UserListAdapter.Listener) {
        var imageurl : String = user.avatarUrl
        Glide.with(binding.root)
            .load(imageurl)
            .into(binding.itemListUserAvatar)
        binding.itemListUserUsername.text = user.login
        binding.itemListUserDeleteButton .setOnClickListener { callback.onClickDelete(user) }
        if (user.isactif) {
            // Set background color for active user
            val backgroundColor = ContextCompat.getColor(binding.root.context, R.color.design_default_color_background)
            binding.root.setBackgroundColor(backgroundColor)
            // Set the icon for the delete button
            binding.itemListUserDeleteButton.setImageResource(R.drawable.ic_delete_black_24dp)
        } else {
            // Set background color for inactive user
            val backgroundColor = ContextCompat.getColor(binding.root.context, R.color.design_default_color_error)
            binding.root.setBackgroundColor(backgroundColor)
            // Set the icon for the restore button
            binding.itemListUserDeleteButton.setImageResource(R.drawable.ic_restore_from_trash_24)
        }
    }

}