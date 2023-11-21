import books.Book
import books.Books
import java.util.Scanner

fun main(args: Array<String>) {
    val booksList = listOf(
        Book("They both die at the and","Tragedi","Rufus"),
        Book("Heaven  offical biessing","Romanse","Sanle"),
        Book("Anne","Romanse","Gilbert"),
        Book("The maze runner","Horror","Tomas")
    )

    val printInfo = Books()
    booksList.forEachIndexed { index, book ->
        println("${index + 1}:${book.name}")
    }
    val scanner =Scanner(System.`in`)
    println("Напишите номер книги,о которой вы хотите узнать")
    val bookInput = readln()?.toIntOrNull()
    if (bookInput!= null && bookInput >=1 && bookInput <= bookInput){
        val selectedBook = booksList[bookInput - 1]
        println("Информация о <<${selectedBook.genre}>>:")
      printInfo.book(selectedBook)
    }else{
        println("error")
    }
}
