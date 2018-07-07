
// First are some development tricks
CSG cube = new Cube(1).toCSG()

// Print all the methods from an object
def methods= cube.metaClass.methods*.name.sort().unique()  
println methods
//Search for getters of maximum values
println "\n\n"+methods.findAll{	it.toLowerCase().contains("get")&&
							it.toLowerCase().contains("max")
}

// Debug exceptions with auto-highlighting of exceptions

throw new RuntimeException("Read the stack trace to find the line numbers of places to look for problems")