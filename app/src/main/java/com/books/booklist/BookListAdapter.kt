package com.books.booklist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.books.R
import com.books.booklist.model.Book
import kotlinx.android.synthetic.main.book_list_item.view.*


class BookListAdapter(val bookList: List<Book>): RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.book_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = bookList.size

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder?.itemView?.apply {
            bookName?.text = bookList[position].bookName
            bookAuthor?.text = bookList[position].bookAuthor
            bookCost?.text = bookList[position].bookCost
        }
    }
}

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val bookName = itemView.bookName
    val bookAuthor = itemView.bookAuthor
    val bookCost = itemView.bookCost
}

