package com.example.myapplication.character

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentCharactersBinding

class CharactersFragment : Fragment() {
    private lateinit var adapter: CharacterAdapter

    private lateinit var binding: FragmentCharactersBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharactersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()

    }

    private fun initAdapter() {
        val adapter = CharacterAdapter(
            arrayListOf(
                CharacterModel(
                    "Naruto Uzumaki",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Flenta.ru%2Fnews%2F2023%2F03%2F10%2Fnaruto%2F&psig=AOvVaw0DfyZgoecBwwWeFYIEqVmF&ust=1701861750822000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOiFqJuX-IIDFQAAAAAdAAAAABAD",
                    "alive"
                ),
                CharacterModel(
                    "Sasuke Uchiha",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Faminoapps.com%2Fc%2Frunaruto%2Fpage%2Fitem%2Fsaske-uchikha%2FXJDX_nxtXIRpM1laNQwoEJvKPzVVDa5k8P&psig=AOvVaw2Oy1eYmaaBjgWHa4wDlYNb&ust=1701861874286000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKDyqNeX-IIDFQAAAAAdAAAAABAD",
                    "alive"
                ),
                CharacterModel(
                    "Kakashi Hatake",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fnaruto.fandom.com%2Fru%2Fwiki%2F%25D0%259A%25D0%25B0%25D0%25BA%25D0%25B0%25D1%2588%25D0%25B8_%25D0%25A5%25D0%25B0%25D1%2582%25D0%25B0%25D0%25BA%25D0%25B5&psig=AOvVaw2SSHVTrsjJIsrM3G1LEYU3&ust=1701861899733000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPCX1OKX-IIDFQAAAAAdAAAAABAD",
                    "alive"
                ),
                CharacterModel(
                    "Asuma Sarutobi",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fnaruto.fandom.com%2Fru%2Fwiki%2F%25D0%2590%25D1%2581%25D1%2583%25D0%25BC%25D0%25B0_%25D0%25A1%25D0%25B0%25D1%2580%25D1%2583%25D1%2582%25D0%25BE%25D0%25B1%25D0%25B8&psig=AOvVaw32vr6f-BkzWr4JXUFx5VSa&ust=1701861921994000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJjzrO2X-IIDFQAAAAAdAAAAABAD",
                    "dead"
                ),
                CharacterModel(
                    "Konohomaru Sarutobi",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fnaruto.fandom.com%2Fru%2Fwiki%2F%25D0%259A%25D0%25BE%25D0%25BD%25D0%25BE%25D1%2585%25D0%25B0%25D0%25BC%25D0%25B0%25D1%2580%25D1%2583_%25D0%25A1%25D0%25B0%25D1%2580%25D1%2583%25D1%2582%25D0%25BE%25D0%25B1%25D0%25B8&psig=AOvVaw0LstkSSzYWUj5gicU29wYG&ust=1701861946645000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPC80_qX-IIDFQAAAAAdAAAAABAD",
                    "alive"
                ),
                CharacterModel(
                    "Hashirama Senju",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fnaruto.fandom.com%2Fru%2Fwiki%2F%25D0%25A5%25D0%25B0%25D1%2588%25D0%25B8%25D1%2580%25D0%25B0%25D0%25BC%25D0%25B0_%25D0%25A1%25D0%25B5%25D0%25BD%25D0%25B4%25D0%25B6%25D1%2583&psig=AOvVaw3lRyYs6z5JKTITdQUlaPPt&ust=1701861970582000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJjUm4SY-IIDFQAAAAAdAAAAABAD",
                    "dead"
                ),
                CharacterModel(
                    "Madara Uchiha",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fnaruto.fandom.com%2Fru%2Fwiki%2F%25D0%259C%25D0%25B0%25D0%25B4%25D0%25B0%25D1%2580%25D0%25B0_%25D0%25A3%25D1%2587%25D0%25B8%25D1%2585%25D0%25B0&psig=AOvVaw1zVsnrPIbEjnZv_Snh94Oo&ust=1701861987861000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJjTrYyY-IIDFQAAAAAdAAAAABAD",
                    "dead"
                ),
            )
        )
        binding.rvCharacters.adapter = adapter
    }
}