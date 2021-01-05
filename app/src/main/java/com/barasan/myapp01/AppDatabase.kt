package com.barasan.myapp01

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Memo::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun memoDao(): MemoDao
}