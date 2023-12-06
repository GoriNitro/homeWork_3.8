package com.example.myapplication.character

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.myapplication.InfoFragment
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemCharactersBinding
import com.example.myapplication.loadImage

class CharacterAdapter(private val characterList: ArrayList<CharacterModel>) :
    Adapter<CharacterAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCharactersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = characterList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(characterList[position])

    }

    inner class ViewHolder(private var binding: ItemCharactersBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)
        }
        fun bind(character: CharacterModel) {
            binding.imgCharacter.loadImage(character.image)
            binding.tvName.text = character.name
            binding.info.text = character.info
        }

        override fun onClick(v: View?) {
            Navigation.findNavController(itemView)
                .navigate(R.id.infoFragment, bundleOf("name" to characterList[position].name,
                    "info" to characterList[position].info, "image" to characterList[position].image))
        }
    }
}
