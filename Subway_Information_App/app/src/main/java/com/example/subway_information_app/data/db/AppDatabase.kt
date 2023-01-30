package com.example.subway_information_app.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.subway_information_app.data.db.entity.StationEntity
import com.example.subway_information_app.data.db.entity.StationWithSubwaysEntity
import com.example.subway_information_app.data.db.entity.SubwayEntity

@Database(
    entities = [StationEntity::class, SubwayEntity::class, StationWithSubwaysEntity::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun stationDao(): StationDao

    companion object {
        private const val DATABASE_NAME = "station.db"

        fun build(context: Context):AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }
}