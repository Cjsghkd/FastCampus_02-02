package com.example.subway_information_app.data.db

import androidx.room.*
import com.example.subway_information_app.data.db.entity.StationEntity
import com.example.subway_information_app.data.db.entity.StationSubwayCrossRefEntity
import com.example.subway_information_app.data.db.entity.StationWithSubwaysEntity
import com.example.subway_information_app.data.db.entity.SubwayEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface StationDao {
    @Transaction
    @Query("SELECT * FROM StationEntity")
    fun getStationWithSubways(): Flow<List<StationWithSubwaysEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStations(station: List<StationEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubways(subways: List<SubwayEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCrossReferences(reference: List<StationSubwayCrossRefEntity>)
}