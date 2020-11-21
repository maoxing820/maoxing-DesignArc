package com.example.designarc.data

interface BookDao {
    var bookList: MutableList<Book>

    fun getBooks(): List<Book>
    fun addBook(book: Book)
}