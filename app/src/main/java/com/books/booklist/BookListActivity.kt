package com.books.booklist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.books.R

class BookListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_list_activity)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout,
                BookListFragment()).addToBackStack(null).commit()
    }

}