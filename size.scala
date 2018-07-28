var list = Array(1, 9, 4, 3);

def size(list : List[Int]) : Int = {
  list match{
    case Nil => 0
    case head :: tail => 1 + size(tail)
  }
}

// ***************************

def last(list : List[Int]) : Int = {
  list match{
    case head :: Nil => head
    case head :: tail => last(tail)
  }
}

// ***************************

def reverse(list : List[Int]) : List[Int] = {
  list match {
    case Nil => List()
    case head :: tail => reverse(tail) ::: List(head)
  }
}
