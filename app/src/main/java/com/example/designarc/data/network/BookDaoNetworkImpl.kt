package com.example.designarc.data.network

import com.example.designarc.data.Book
import com.example.designarc.data.BookDao

class BookDaoNetworkImpl : BookDao{
    override var bookList: MutableList<Book> = mutableListOf()


    override fun getBooks(): List<Book> {
        return bookList
    }

    override fun addBook(book: Book) {
        bookList.add(book)
    }

}