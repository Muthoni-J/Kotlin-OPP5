fun main(){
    var person=Human("Ocean Nyima",4,15)
    person.eat(1)
    println(person.weight)
    person.speak("I am a big boy now mum ")



    var client=User("Allan","Nyima","allannyima@gmail.com",721232446,"Allan,2022.")
    println(client.firstname)
    println(client.email)
}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//-speak(speech: String) :Prints the string passed to it
//-birthday( ) :Increments the human’s age by 1
//Create an instance of this human class and invoke all its functions

class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating ${foodWeight}  of food")
        weight += foodWeight
    }

    fun speak(speech: String) {
        println(speech)
    }
    fun birthday(increment:Int){
        age++

    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes
data class User(var firstname: String,var  lastnameage:String,var email:String,var phonenumber:Int,var password:String){

}
