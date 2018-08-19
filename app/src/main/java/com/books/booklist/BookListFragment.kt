package com.books.booklist

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.books.R
import com.books.booklist.model.Book
import kotlinx.android.synthetic.main.book_list_fragment.*

class BookListFragment : android.support.v4.app.Fragment(), BookListContract.View {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.book_list_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvBookList.layoutManager = LinearLayoutManager(activity)

        val bookList = ArrayList<Book>()

        bookList.add(Book("C", "ABC", "100"))
        bookList.add(Book("C++", "DEF", "200"))
        bookList.add(Book("JAVA", "GHI", "300"))


        rvBookList.adapter = BookListAdapter(bookList)
    }
}