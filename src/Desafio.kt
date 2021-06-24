/*
import java.util.Scanner

fun main (){
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()

    println("SOMA = "+ soma (  a +  b ))  //insira as variáveis corretamente
}


import java.util.Scanner

fun main(args: Array<String>) {

    for (i in 1.rangeTo(readLine()!!.toInt()).step(2)) println(i) //complete o codigo com os valores corretos

}


fun main(args: Array<String>) {
    //insira as variaveis corretamente
    var r = 0
    for (i in 1..readLine()!!.toInt()) {

        println("$i ${  i*i   } ${  i*i*i  }")

        r += 0
    }
}




import java.util.Scanner

fun main(args: Array<String>) {
  var reader = Scanner(System.`in`)

  var a = reader.nextDouble()
  var b = reader.nextDouble()
    
  var weightA = 3.5
  var weightB = 7.5
  var totalWeight = weightA + weightB
    
  var m = (a * weightA + b * weightB) / totalWeight

  var r = "%.5f".format(m)
    
  println("MEDIA = ${r}")
}




fun main(args: Array<String>) {

  val a = readLine()!!.toInt()
  val b = readLine()!!.toInt()

  println("PROD = ${a*b}")   //insira as variaveis corretamente

}





fun main(args: Array<String>) {

  val input = readLine()!!
//continue a solucao
  val a = input.split(" ")[0].toInt()
  val b = input.split(" ")[1].toInt()
  val c = input.split(" ")[2].toInt()
  val d = input.split(" ")[3].toInt()

  if ( b > c && d > a && ( c + d ) > ( a + b ) && c > 0 && d > 0 && a % 2 == 0 ) {
    println("Valores aceitos")
  } else {
    println("Valores nao aceitos")
  }

}




fun main(args: Array<String>) {
    
    val n = readLine()!!.toInt()
    //declare suas variaveis auxiliares e continue a solucao
    var sum: Int
    var temp: Int
    var previous: Int
    sum = 0
    temp = 0
    previous = 0


    for (i in 1..(n - 1)) {
        print("$sum ")

        sum = sum + previous
        previous = temp
        if (sum == 0) sum = 1
        temp = sum
    }
    println("$sum")
    
}




fun main(args: Array<String>) {

  val inteiros = mutableListOf<Int>()
//continue declarando as variaveis
    val pares = mutableListOf<Int>()
    val impares = mutableListOf<Int>()
    val positivos = mutableListOf<Int>()
    val negativos = mutableListOf<Int>()

    for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }
    for (i in inteiros) { if ( i % 2 == 0 ) { pares.add(i) } }
    for (i in inteiros) { if ( i % 2 != 0 ) { impares.add(i) } }
    for (i in inteiros) { if ( i > 0 ) { positivos.add(i) } }
    for (i in inteiros) { if ( i < 0 ) { negativos.add(i) } }

    println("${pares.size} valor(es) par(es)")
    println("${impares.size} valor(es) impar(es)")
    println("${positivos.size} valor(es) positivo(s)")
    println("${negativos.size} valor(es) negativo(s)")

}





fun main(args: Array<String>) {
    
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')

    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }

//insira as variaveis de acordo com o calculo do perimetro e area

    val p = ( a + b  + c ).format(1)

    val r = ( ( ( a + b ) * c / 2 ) ).format(1)

    if ( a < ( b + c ) && b < ( c + a ) && c < ( a + b ) ) println("Perimetro = $p")

    else println("Area = $r")
    
}





import java.io.EOFException

fun main(args: Array<String>) {
    var result = 0
    var total = 0
    while (true) {

        try {

            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { map{it.toInt() }.toMutableList() }
            v.sort()
            result = when (v.last()) {
                in 0..9 -> 1
                in 10..19 -> 2
                else -> 3
            }


            println(result)




        } catch (f : Exception) {
            break
        } catch (n : Exception) {
            break
        } catch (e : Exception) {
            break
        }
    }
}





import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    for (i in 1..input.nextInt()) {
        var raio1 = input.nextInt()
        var raio2 = input.nextInt()
        println(raio1 + raio2)
    }
}




import java.util.Scanner

fun main (args: Array<String>) {
    var reader = Scanner(System.`in`)
    var k = reader.nextInt()
    val dist = k * 2
        println("${dist} minutos")
}





import java.util.Scanner

fun main (args: Array<String>) {
    var reader = Scanner(System.`in`)
    var n = reader.nextInt()

    println(n)
    println("${n/100} nota(s) de R$ 100,00")
    n %= 100
    println("${n/50} nota(s) de R$ 50,00")
    n %= 50
    println("${n/20} nota(s) de R$ 20,00")
    n %= 20
    println("${n/10} nota(s) de R$ 10,00")
    n %= 10
    println("${n/5} nota(s) de R$ 5,00")
    n %= 5
    println("${n/2} nota(s) de R$ 2,00")
    n %= 2
    println("$n nota(s) de R$ 1,00")
}


*/

