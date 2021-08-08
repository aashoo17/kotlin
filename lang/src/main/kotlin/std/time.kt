package std

import java.time.*

fun duration(){
    //class Duration has 2 fields seconds and nanos - field with value of second and nanosecond elapsed from some reference time
    val a = Duration.ofSeconds(10)
    val b = Duration.ofMillis(100)
    val c = Duration.ofNanos(100)

    //getting values of seconds and nanos
    val d = a.seconds
    val e = a.nano
    println(d)
    println(e)
}

fun calendarTime(){
    //epoch - 1st Jan 1970, 00:00:00 hrs
    val a = ZonedDateTime.now()

    //getting year, month, day and hours, min, sec
    var b = a.getHour();
    var c = a.getMinute();
    var d = a.getSecond();

    var e = a.getYear();
    var f = a.getMonth();
    var g = a.getDayOfMonth();

    val h = LocalDateTime.now();
    //getting year, month, day and hours, min, sec
    var i = h.getHour();
    var j = h.getMinute();
    var k = h.getSecond();

    var l = h.getYear();
    var m = h.getMonth();
    var n = h.getDayOfMonth();
}

fun instant(){
    val a = Instant.now();
    //do something here
    val b = Instant.now();
    val c = b.compareTo(a);     //TODO: what is it returning - nanoseconds ??
    println(c);
}