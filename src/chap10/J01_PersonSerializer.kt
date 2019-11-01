package chap10

import kotlin.reflect.KClass

data class Person(
    @JsonName("alias") val name:String,
    @JsonExclude
    val age: Int? = null
)

annotation class JsonName(val name:String)

@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude


@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class BindingAnnotation

@BindingAnnotation
annotation class MyBinding

// @DeserializeInterface(CompanyImpl::class) 처럼 클래스 참조를 인자로 받는
// 애노테이션을 어떻게 정의하는가?
annotation class DeserializeInterface(val targetClass: KClass<out Any>)


// CustomerSerializer 애노테이션은 커스텀 직렬화 클래스에 대한 참조를 인자로 받는다

interface ValueSerializer<T>{
    fun toJsonValue(value: T): Any?
    fun fromJsonValue(jsonValue: Any?): T
}

// DateSerializer::class 는 올바른 인자로 받아들이지만 Date::class 는 거부한다
// ValueSerializer::class 뿐 아니라 ValueSerializer를 구현하는 모든 클래스를 받아들인다
// ValueSerializer를 사용해 어떤 타입의 값읻느 직렬화할 수 있게 허용한다
annotation class CustomSerializer(
    val serializerClass : KClass<out ValueSerializer<*>>
)

fun main() {

}