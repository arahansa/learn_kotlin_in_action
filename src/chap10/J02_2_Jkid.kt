package chap10

import strings.joinToString

import kotlin.reflect.full.memberProperties



private fun StringBuilder.serializeObject(obj: Any){
    val kClass = obj.javaClass.kotlin
    val properties = kClass.memberProperties

    properties.joinToString()
}

fun serialize(obj: Any): String = buildString { serializeObject(obj) }

fun main() {
        
}