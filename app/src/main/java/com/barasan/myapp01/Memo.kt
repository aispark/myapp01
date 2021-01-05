package com.barasan.myapp01

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Memo(var title: String) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}
