fun main() {
    var selly= Human("Selly",25,56.5,)
    selly.eat(6)
    println(selly.weight)
    selly.speak("Dutch")
    println(selly.age)
    selly.birthday()
    println(selly.age)
    var user= UserDetails("Hale","Jin","jinhale@yahoomail.com",724536970,"@milan267")
    println(user.email)
    println(user.password)
}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions
class Human(var name:String, var age: Int, var weight:Double){
    fun eat(foodWeight:Int) {
        println("I am eating $foodWeight kgs of food.")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println("I speak $speech.")
    }
    fun birthday(){
        age+=1
    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class UserDetails(var firstName:String, var lastName:String, var email:String, var phoneNumber:Long, var password:String)
fun user() {
}