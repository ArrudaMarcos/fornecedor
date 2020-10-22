package br.com.marcos.microservice.fornecedor.repository;

import br.com.marcos.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    public InfoFornecedor findByEstado(String estado);
}
