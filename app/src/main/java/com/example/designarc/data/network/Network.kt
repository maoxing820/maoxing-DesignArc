package com.example.designarc.data.network

import com.example.designarc.data.db.BookDaoImpl
import com.example.designarc.data.db.DataBase

class Network private constructor(){
    val bookDao = BookDaoNetworkImpl()
    companion object{
        @Volatile private var instance: Network? = null
        fun getInstance() = instance ?: synchronized(this){
            instance ?: Network().also { instance = it }
        }
    }
}