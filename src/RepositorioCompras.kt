class RepositorioCompras(
    val listaCompras: MutableList<Compra> = mutableListOf(),

) {
    fun agregarCompra(compra: Compra) {
        listaCompras.add(compra)
    }

    fun agregarCompra(cliente: Cliente, dia: Int, monto: Double){
        listaCompras.add(Compra(cliente, dia, monto))
    }

    fun agregar(nombre: String, calle: String, numero: Int, dia: Int, monto: Double){
        listaCompras.add(Compra(Cliente(nombre, Domicilio(calle, numero)), dia, monto))
    }

    fun domicilios(): List<String> {
        val setDomicilios = mutableSetOf<String>()
        listaCompras.forEach {setDomicilios.add(it.cliente.domicilio.dirCompleta())}
        return setDomicilios.toList()
    }

    fun domiciliosV2(): List<String>{
        return listaCompras.map { it.cliente.domicilio.dirCompleta() }.toSet().toList()
    }
}