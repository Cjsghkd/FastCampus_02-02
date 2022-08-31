package com.example.musicstreamingapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.musicstreamingapp.databinding.FragmentPlayerBinding
import com.example.musicstreamingapp.service.MusicDto
import com.example.musicstreamingapp.service.MusicService
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class PlayerFragment : Fragment(R.layout.fragment_player) {

    private var binding : FragmentPlayerBinding? = null
    private var isWatchingPlayListView = true

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentPlayerBinding = FragmentPlayerBinding.bind(view)
        binding = fragmentPlayerBinding

        initPlayListButton(fragmentPlayerBinding)

        getVideoListFromServer()
    }

    private fun initPlayListButton(fragmentPlayerBinding: FragmentPlayerBinding) {
        fragmentPlayerBinding.playlistImageView.setOnClickListener {
            // todo 만약에 서버에서 데이터가 다 불러오지 않은 상태 일 때
            fragmentPlayerBinding.playerViewGroup.isVisible = isWatchingPlayListView
            fragmentPlayerBinding.playerListGroup.isVisible = isWatchingPlayListView.not()

            isWatchingPlayListView = !isWatchingPlayListView
        }
    }

    private fun getVideoListFromServer() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://run.mocky.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(MusicService::class.java)
            .also {
                it.listMusics()
                    .enqueue(object : Callback<MusicDto> {
                        override fun onResponse(call: Call<MusicDto>, response: Response<MusicDto>) {
                            Log.d("PlayerFragment", "${response.body()}")

                            response.body()?.let {
                                val modelList = it.musics.mapIndexed { index, musicEntity ->
                                    musicEntity.mapper(index.toLong())
                                }
                            }
                        }

                        override fun onFailure(call: Call<MusicDto>, t: Throwable) {

                        }

                    })
            }
    }

    companion object {
        fun newInstance() : PlayerFragment {
            return PlayerFragment()
        }
    }
}