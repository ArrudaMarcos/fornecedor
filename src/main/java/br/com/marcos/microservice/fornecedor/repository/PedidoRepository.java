package br.com.marcos.microservice.fornecedor.repository;

import br.com.marcos.microservice.fornecedor.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
