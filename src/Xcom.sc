case class Cell(x:Int, y:Int, otype:String)
case class Field(cells:Array[Cell])

val field1 = Field(Array.ofDim[Cell](4))

field1.cells(1)= Cell(0,0, "X");
field1.cells(0) = Cell(0,2,"S");
field1.cells(2)= Cell(0,0, "X");
field1.cells(3)= Cell(0,0, "R");



field1.cells(0).x
field1.cells(0).y

field1.cells(1).x
field1.cells(1).y
field1.cells(1).otype

println("_____")
println(field1.cells(0).otype + " | " + field1.cells(1).otype);
println("------")
println(field1.cells(2).otype + " | " + field1.cells(3).otype);
println("------")


case class Character(mrange:Int, srange:Int, hp:Int)

