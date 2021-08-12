package std

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter

// normal io
fun io(){
    val a = FileReader("file.txt")
    val b = CharArray(100)
    a.read(b)
    a.close()

    val c = FileWriter("file.txt")
    c.write("Hello there man of wisdom")
    c.close()
}

// buffered io
fun bufferedIO(){
    val a = FileWriter("file.txt")
    val b = BufferedWriter(a)
    b.write("Hello world of myself")
    b.close()

    val c = FileReader("file.txt")
    val d = BufferedReader(c)
    //todo: initialize properly to remove the garbage output
    val e = CharArray(100)
    d.read(e)
    println(e)
    d.close()
}
