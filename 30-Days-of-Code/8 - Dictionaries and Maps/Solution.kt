import java.io.*
import java.util.*

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        val phoneDirectory: HashMap<String, Int> = hashMapOf()
        val NototalContact = readLine().toString()
        // println("total contacts to show"+NototalContact)
            for(i in 1..NototalContact.toInt()){
            val contactString = readLine()
            val contactArray: List<String>? = contactString?.split(" ")
            phoneDirectory.put(contactArray?.get(0)!!, contactArray.get(1).toInt())
        }
        // println("CHECK FROM HERE")
        while(true){
            val searchContact = readLine()
            if(searchContact == null){
                break
            }
            if(searchContact in phoneDirectory) println("$searchContact=${phoneDirectory[searchContact]}") else println("Not found")
        }
}
