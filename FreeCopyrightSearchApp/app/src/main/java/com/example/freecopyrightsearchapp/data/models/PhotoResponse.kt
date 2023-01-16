package com.example.freecopyrightsearchapp.data.models


import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("blur_hash")
    val blurHash: String?,
    @SerializedName("color")
    val color: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("current_user_collections")
    val currentUserCollections: List<CurrentUserCollection?>?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("downloads")
    val downloads: Int?,
    @SerializedName("exif")
    val exif: Exif?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("liked_by_user")
    val likedByUser: Boolean?,
    @SerializedName("likes")
    val likes: Int?,
    @SerializedName("links")
    val links: Links?,
    @SerializedName("location")
    val location: Location?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("urls")
    val urls: Urls?,
    @SerializedName("user")
    val user: User?,
    @SerializedName("width")
    val width: Int?
) {
    data class CurrentUserCollection(
        @SerializedName("cover_photo")
        val coverPhoto: Any?,
        @SerializedName("id")
        val id: Int?,
        @SerializedName("last_collected_at")
        val lastCollectedAt: String?,
        @SerializedName("published_at")
        val publishedAt: String?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("updated_at")
        val updatedAt: String?,
        @SerializedName("user")
        val user: Any?
    )

    data class Exif(
        @SerializedName("aperture")
        val aperture: String?,
        @SerializedName("exposure_time")
        val exposureTime: String?,
        @SerializedName("focal_length")
        val focalLength: String?,
        @SerializedName("iso")
        val iso: Int?,
        @SerializedName("make")
        val make: String?,
        @SerializedName("model")
        val model: String?
    )

    data class Links(
        @SerializedName("download")
        val download: String?,
        @SerializedName("download_location")
        val downloadLocation: String?,
        @SerializedName("html")
        val html: String?,
        @SerializedName("self")
        val self: String?
    )

    data class Location(
        @SerializedName("city")
        val city: String?,
        @SerializedName("country")
        val country: String?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("position")
        val position: Position?
    ) {
        data class Position(
            @SerializedName("latitude")
            val latitude: Double?,
            @SerializedName("longitude")
            val longitude: Double?
        )
    }

    data class Urls(
        @SerializedName("full")
        val full: String?,
        @SerializedName("raw")
        val raw: String?,
        @SerializedName("regular")
        val regular: String?,
        @SerializedName("small")
        val small: String?,
        @SerializedName("thumb")
        val thumb: String?
    )

    data class User(
        @SerializedName("bio")
        val bio: String?,
        @SerializedName("id")
        val id: String?,
        @SerializedName("instagram_username")
        val instagramUsername: String?,
        @SerializedName("links")
        val links: Links?,
        @SerializedName("location")
        val location: String?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("portfolio_url")
        val portfolioUrl: String?,
        @SerializedName("total_collections")
        val totalCollections: Int?,
        @SerializedName("total_likes")
        val totalLikes: Int?,
        @SerializedName("total_photos")
        val totalPhotos: Int?,
        @SerializedName("twitter_username")
        val twitterUsername: String?,
        @SerializedName("updated_at")
        val updatedAt: String?,
        @SerializedName("username")
        val username: String?
    ) {
        data class Links(
            @SerializedName("html")
            val html: String?,
            @SerializedName("likes")
            val likes: String?,
            @SerializedName("photos")
            val photos: String?,
            @SerializedName("portfolio")
            val portfolio: String?,
            @SerializedName("self")
            val self: String?
        )
    }
}