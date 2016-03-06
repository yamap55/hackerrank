def a = System.in.newReader().readLines().drop(1).collect{it.split(" ").collect{it as int}}

def n1 = 0
a.eachWithIndex {v, i ->
  n1 += v[i]  
}
def n2 = 0
a.eachWithIndex {v, i ->
  n2 += v[a.size() - i -1]  
}
println Math.abs(n1 - n2)