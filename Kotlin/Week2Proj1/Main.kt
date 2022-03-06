import java.util.Collections.list

fun main(args: Array<String>) {

    var amy = Customer("Amy", 20)
    var brad = Customer("Brad", 20)
    var cathy = Customer("Cathy", 20)
    var diego = Customer("Diego", 20)
    var elle = Customer("Elle", 20)
    var frances = Customer("Frances", 20)
    var gustavo = Customer("Gustavo", 20)
    var hendrick = Customer("hendrick", 20)
    var ismail = Customer("Ismail", 20)
    var john = Customer("John", 31)
   // println(kevin.toString())
    customerList(amy, cathy, brad, diego, elle, frances, gustavo, hendrick, ismail, john)

    var lists = listOf(listOf("Walmart", 102.32), listOf("Costco", 431.02), listOf("Kroger", 43.23),
    listOf("Macy's", 321.32))
    lists.flatten()
    println(lists)

    var nameLists = listOf("Sam", "Tim", "Usher", "Vergil")
    nameLists.zipWithNext()
    println(nameLists)

    val nums = List(20){ it }
    val evens = nums.filter { it % 2 == 0 }
    println(evens)

    val multiplesOf13 = List(11){it * 13}.filter { it != 0 }
    println(multiplesOf13)
}

private var counter = 0
class Customer(name : String, age : Int){
    private val uniqueID :String
    private val name :String
    init {
        counter++
        uniqueID = "ID: $counter"
        this.name = name
    }

    override fun toString(): String {
        return uniqueID
    }

    fun getName(): String{
        return this.name
    }
}

fun customerList(vararg c : Customer){
    val myList = mutableListOf<Pair<String, String>>()
    for(cust in c){
        myList.add(Pair(cust.getName(), cust.toString()))
    }

    for(entry in myList){
        println(entry.toString())
    }

}