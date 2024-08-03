//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Enter the number of stars ")
    var index=readLine()?.toInt()

    for(i in 1..index!!){
        for(j in 1..index-i){
            print(" ")
        }
        for (k in 1..(i*2-1)){
            print("*")
        }
        println()

    }

    println("=============")
    for(i in 1..index!!){
        for(j in 1..i){
            print("*")
        }
        for (k in 1..index-i){
            print(" ")
        }
        println()
    }
    println("=============")
    for(i in 1..index!!){

        for (k in 1..index-i){
            print(" ")
        }
        for(j in 1..i){
            print("*")
        }
        println()
    }
}