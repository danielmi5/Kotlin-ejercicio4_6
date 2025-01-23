class RepositorioCompras(
    val listaCompras: MutableList<Compra> = mutableListOf(),

) {
    fun agregarCompra(compra: Compra) {
        listaCompras.add(compra)
    }
    fun domicilios(): Set<String> {
        val setDomicilios = mutableSetOf<String>()
        listaCompras.forEach {setDomicilios.add(it.cliente.domicilio.dirCompleta())}
        return setDomicilios
    }
}