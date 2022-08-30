package com.example.musicstreamingapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.musicstreamingapp.service.MusicDto
import com.example.musicstreamingapp.service.MusicService
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class PlayerFragment : Fragment(R.layout.fragment_player) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getVideoListFromServer()
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