import java.time.*

fun calendarTime(){
    val a = LocalDateTime.now()
    val b = ZonedDateTime.now()

    val c = a.year
    val d = a.month
    val e = a.dayOfMonth

    val f = a.hour
    val g = a.minute
    val h = a.second
}

fun elapsedTime(){
    val a = Instant.now()
}

