package com.example.designarc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.designarc.data.Book
import com.example.designarc.data.BookRepository
import com.example.designarc.data.db.DataBase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeUI()
    }
    private fun initializeUI(){
        mBtn.setOnClickListener {
            // 检查
            if (mNameEditText.text.isEmpty()){
                Toast.makeText(this,"Name为空",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (mAuthorEditText.text.isEmpty()){
                Toast.makeText(this,"Author为空",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            // 数据保存到本地数据库
            // 数据通过网络上传到服务器
//            val content = "${mTextView.text}\n\n ${mNameEditText.text}-${mAuthorEditText.text}"
//            mTextView.text = content
            val book = Book(mNameEditText.text.toString(), mAuthorEditText.text.toString())
            BookRepository.getInstance().addBook(book)


        }
    }
}















