package deloof.wouter.orm_opdracht.model;

import org.springframework.data.repository.CrudRepository;

public interface WerknemerDAO extends CrudRepository<Werknemer, Integer> {

    // Zoek op naam
    Iterable<Werknemer> findByNaam( String naam );

}
