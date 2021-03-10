fun main() {
    val x="my name is"
    val name=" janet anyijukire"
    println(x+""+name)
    val text="banana"
    println(text[0])
    println(text[1])
    println(text[2])
    println(text[3])
    println(text[4])
    println(text[5])
    val year="2001"
    val sentence="$name was born in $year"
    println(sentence)
    var y="african inventor"
    println(y.toUpperCase())
    println(y.toLowerCase())
    println(y.capitalize())
    println(y.decapitalize())
    val message="te3ache5r5ruth"
    val message2="te3ache5r5ruth"
    if(message.equals(message2)){println(true)

}
val message3="ebirumabayaye"
  val message5="gdge343jdjd"
    if(message3.equals(message5)){println(true)}
    else{println(false)}
  val emptyString =""
  val blankString =" "
  println(emptyString.isBlank())
    println(emptyString.isEmpty())
    println(blankString.isEmpty())
    println(blankString.isBlank())
    println(name.trimEnd())
    println(name.trimStart())
    println(name.trim())
    val location="Burora"
    println(location.endsWith("a"))
    println(location.startsWith("g"))
    val term="Janet Sevo is a Ugandan cabinet minister. "+"she has served Ugandan people for five years"
    println(term.replace("Ugandan","African"))
    val word= "pens, books, pencils, colors, rubers, rulers, compasses, sets,"
    val materials=word.split(",")
    println(materials)
    println(materials[1])
    println(materials[2])
    println(materials[3])
    val weight=60.5
    println("my weight is "+weight.toString())

}
