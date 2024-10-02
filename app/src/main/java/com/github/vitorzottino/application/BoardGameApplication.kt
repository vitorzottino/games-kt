package com.github.vitorzottino.application

import BoardGameDatabase
import android.app.Application
import com.github.vitorzottino.repository.BoardGameRepository

class BoardGameApplication : Application() {

    val database by lazy { BoardGameDatabase.getDatabase(this) }
    val repository by lazy { BoardGameRepository(database.boardGameDao()) }

}