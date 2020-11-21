package com.example.designarc.data

import com.example.designarc.data.db.DataBase
import com.example.designarc.data.network.Network

class BookRepository private constructor(){
//    val bookDao = Network.getInstance().bookDao
    private val bookDao = DataBase.getInstance().bookDao
    companion object{
        @Volatile private var instance: BookRepository? = null
        fun getInstance() = instance ?: synchronized(this){
            instance ?: BookRepository().also { instance = it }
        }
    }
    fun getBook(): List<Book>{
        return bookDao.getBooks()
    }

    fun addBook(book: Book){
        bookDao.addBook(book)
    }
}