def a = System.in.newReader().readLines().collect{it.split(" ").collect{ it as int }}
def n = a.first()[0]
def ar = a[1].groupBy{it.compareTo(0)}

def f = {
    println it == null ? "0.000000" : ((it.size() as BigDecimal).divide(n, 6, BigDecimal.ROUND_HALF_UP))
}
f(ar[1 as Integer])
f(ar[-1 as Integer])
f(ar[0 as Integer])