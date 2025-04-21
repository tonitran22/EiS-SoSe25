import scala.io.Source
import scala.util.{Try, Success, Failure}

def main(args: Array[String]): Unit = {
  var number = 10007*100003
  //Test if number is prime
  var i = 2
  var isPrime = true
  while (i <= math.floor(math.sqrt(result))) {
    if (result % i == 0) {
      isPrime = false
    }
    i += 1
  }
  if (isPrime) {
    println(s"$result is a prime number")
  } else {
    println(s"$result is not a prime number")
  }
}