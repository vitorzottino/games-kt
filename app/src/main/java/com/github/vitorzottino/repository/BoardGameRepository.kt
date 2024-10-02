package com.github.vitorzottino.repository

import androidx.lifecycle.LiveData
import com.github.vitorzottino.dao.BoardGameDao
import com.github.vitorzottino.model.BoardGame

class BoardGameRepository(private val boardGameDao: BoardGameDao) {

    val allBoardGames: LiveData<List<BoardGame>> = boardGameDao.getAllBoardGames()


    suspend fun insert(boardGame: BoardGame) {
        boardGameDao.insert(boardGame)
    }

    suspend fun update(boardGame: BoardGame) {
        boardGameDao.update(boardGame)
    }

    suspend fun delete(boardGame: BoardGame) {
        boardGameDao.delete(boardGame)
    }

}