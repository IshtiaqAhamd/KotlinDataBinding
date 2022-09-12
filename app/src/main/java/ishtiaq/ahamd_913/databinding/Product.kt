package ishtiaq.ahamd_913.databinding

class Product {
    private lateinit var pname: String

    constructor(pname: String) {
        this.pname = pname
    }
   public fun getPname():String{
        return pname
    }
   public fun setPname(pname: String){
        this.pname = pname
    }
}