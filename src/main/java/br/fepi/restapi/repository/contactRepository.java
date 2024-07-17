package br.fepi.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.restapi.model.contact;

public interface contactRepository extends JpaRepository<contact, Long>{

}
