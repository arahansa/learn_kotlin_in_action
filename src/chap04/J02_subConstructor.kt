package chap04

class Context{}
class AttributesSet{}
open class View{
    constructor(ctx:Context){}
    constructor(ctx:Context, attr:AttributesSet){}
}

class MyButton:View{
    constructor(ctx:Context):super(ctx){}
    constructor(ctx:Context, attr:AttributesSet):super(ctx, attr){}
}