package com.example.designarc.data.db

class DataBase private constructor(){
    val bookDao = BookDaoImpl()
    companion object{
        @Volatile private var instance: DataBase? = null
        fun getInstance() = instance ?: synchronized(this){
            instance ?: DataBase().also { instance = it }
        }
    }

}