package com.example.musicstreamingapp

import com.example.musicstreamingapp.service.MusicEntity

fun MusicEntity.mapper(id : Long) : MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )