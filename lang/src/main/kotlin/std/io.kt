package std

import java.io.*

/*
Java IO apis:
kotlin basically uses java io api
java io - these are old apis
java nio - newer java io apis
*/

/*
Java IO:
non buffered io
1. Byte based - FileInputStream, FileOutputStream
2. Character based - FileReader, FileWriter
Buffered IO
1. Byte based - BufferedInputStream, BufferedOutputStream
2. Character based - BufferedReader, BufferedWriter
 */

fun characterBasedIO(){
    val a = FileReader("file.txt")
    val b = CharArray(100)
    a.read(b)
    a.close()   //explicitly clear the resources

    val c = FileWriter("file.txt")
    c.write("Hello there man of wisdom")
    c.close()
}

fun characterBasedBufferedIO(){
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

fun byteBasedIO(){
    val a = FileInputStream("file.txt")
    val b = ByteArray(100)
    a.read(b)
    a.close()

    val c = FileOutputStream("file.txt")
    val d = ByteArray(100){it.toByte()}
    c.write(b)
    c.close()
}

fun byteBasedBufferedIO(){
    val a = FileInputStream("file.txt")
    val b = BufferedInputStream(a)
    val c = ByteArray(100)
    b.read(c)
    b.close()

    val d = FileOutputStream("file.txt")
    val e = BufferedOutputStream(d)
    val f = ByteArray(100){it.toByte()}
    e.write(f)
    e.close()
}

/*
 Java NIO:
 Buffers:
 they will be data containers
 IO capable device abstraction - socket, file etc.
 Channels:

 */
