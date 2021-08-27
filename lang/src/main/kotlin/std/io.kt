package std

import java.io.*
import java.nio.ByteBuffer
import java.nio.channels.AsynchronousFileChannel
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/*
Java IO:
non buffered IO
1. Byte based - FileInputStream, FileOutputStream
2. Character based - FileReader, FileWriter
Buffered IO:
1. Byte based - BufferedInputStream, BufferedOutputStream
2. Character based - BufferedReader, BufferedWriter
 */

fun characterBasedIO(){
    val a = FileReader("std/file.txt")
    val b = CharArray(100)
    a.read(b)
    a.close()   //explicitly clear the resources

    val c = FileWriter("std/file.txt")
    c.write("Hello there man of wisdom")
    c.close()
}

fun byteBasedIO(){
    val a = FileInputStream("std/file.txt")
    val b = ByteArray(100)
    a.read(b)
    a.close()

    val c = FileOutputStream("std/file.txt")
    val d = ByteArray(100){it.toByte()}
    c.write(b)
    c.close()
}

fun characterBasedBufferedIO(){
    val a = FileWriter("std/file.txt")
    val b = BufferedWriter(a)
    b.write("Hello world of myself")
    b.close()

    val c = FileReader("std/file.txt")
    val d = BufferedReader(c)
    //todo: initialize properly to remove the garbage output
    val e = CharArray(100)
    d.read(e)
    println(e)
    d.close()
}

fun byteBasedBufferedIO(){
    val a = FileInputStream("std/file.txt")
    val b = BufferedInputStream(a)
    val c = ByteArray(100)
    b.read(c)
    b.close()

    val d = FileOutputStream("std/file.txt")
    val e = BufferedOutputStream(d)
    val f = ByteArray(100){it.toByte()}
    e.write(f)
    e.close()
}

// Java NIO

// Buffer
fun buffer(){
    // creating buffer
    val buffer = ByteBuffer.allocate(30)

    // getting/setting value at some index location
    val valueAtIndex = buffer.get(10)     //get a single value
    val sliceBytes = ByteArray(10)
    buffer.get(sliceBytes)   //get a slice
    for (b in sliceBytes){
        print(b)
    }
    // set values
    buffer.put(10)      //set a single value
    buffer.put(ByteArray(10){it.toByte()})  //set a slice

    // printing all buffer values
    val bytes = buffer.array()      //get the values as normal arrays
    for(b in bytes){
        print(b)
        print(" ")
    }
}

// path api - https://www.baeldung.com/java-nio-2-file-api
fun pathApi(): Path {
    // try to get Path to a file location
    val path = Paths.get("file.txt")
    //if file does not exist at that path create one
    if(!Files.exists(path)){
        Files.createFile(path)
    }
    // do the read/write operations now as the file is available at that location
    return path
}

// Channels
// asynchronous socket channels is not done as it is easy in ktor
fun channel(){
    val path = pathApi()
    //channel creation - file channel
    val asynchronousFileChannel = AsynchronousFileChannel.open(path)
    // read and write calls on the channel
    val buffer = ByteBuffer.allocate(30)
    val bytes = "Hello World".toByteArray()
    buffer.put(bytes)
    //fixme: write not working
    asynchronousFileChannel.write(buffer,0)
}


