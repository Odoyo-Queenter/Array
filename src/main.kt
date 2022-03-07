fun main(){
    names(arrayOf("Faith","Kimberly","Valentino","Angela"))
    towns()
    numbers(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    mention(arrayOf("Rhoda","Akinyi","Odoyo"))

}
fun names(name:Array<String>){
    println(name.contentToString())
}
fun towns(){
    var cities = arrayListOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { city->
        println(city.capitalize())
    }
}
fun numbers(number:Array<Int>){
    var sum = number[1] + number[4]
    println(sum)
    var index = number.indexOf(158)
    println(index)
    var element = number.sortedArray()
    println(element.contentToString())

}
fun mention(mention:Array<String>):Array<String>{
    var ladies = mention
    println(ladies.contentToString())
    return ladies


}