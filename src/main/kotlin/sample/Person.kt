package sample

abstract class Person {
    private var name:String?=null
    private var age:Int=15

    open fun inputInfo(){
        println("Name: ")
        this.name = readLine().toString()
        println("Age: ")
        this.age = readLine()?.toInt()!!
    }
    open fun showInfo(){
        println("name:"+this.name)
    }
}