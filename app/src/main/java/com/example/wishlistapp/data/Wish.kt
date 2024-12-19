package com.example.wishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(
            title = "Google Watch 2",
            description = "An android Watch"
        ),
        Wish(
            title = "Oculus Quest 2",
            description = "A science friction book from any best seller"
        ),
        Wish(
            title = "Bean bag",
            description = "A comfy bean bag to substitute for a chair "
        ),
        Wish(
            title = "A Sci-fi, Book",
            description = "A VR headset for playing games"
        )
    )
}