package com.example.designarc.data.db

import com.example.designarc.data.Book
import com.example.designarc.data.BookDao

class BookDaoImpl() : BookDao{
    // 模拟数据库中存储的数据
    override var bookList: MutableList<Book> = mutableListOf()

    override fun getBooks(): List<Book> {
        return bookList
    }

    override fun addBook(book: Book) {
        bookList.add(book)
    }
}