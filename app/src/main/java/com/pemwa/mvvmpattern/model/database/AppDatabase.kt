package com.pemwa.mvvmpattern.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pemwa.mvvmpattern.model.Post
import com.pemwa.mvvmpattern.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun postDao(): PostDao
}