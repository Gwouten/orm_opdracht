package deloof.wouter.orm_opdracht.Controllers;

import deloof.wouter.orm_opdracht.model.Werknemer;
import deloof.wouter.orm_opdracht.model.WerknemerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping( value = "/employees" )
public class WerknemerController {

    @Autowired
    WerknemerDAO dao;

    @RequestMapping( value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createWerknemer(String naam, long telefoonnummer, String email) {
        Werknemer w = new Werknemer();
        w.setNaam( naam );
        w.setTelefoonnummer( telefoonnummer );
        w.setEmail( email );
        dao.save( w );
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping( value= "", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Werknemer> showAll() {
        return dao.findAll();
    }

    @RequestMapping( value = "/id-{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Werknemer> showId(
        @PathVariable( value = "id") int id
    ) {
        return dao.findById( id );
    }

    @RequestMapping( value = "/employees", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Werknemer> showName(
        @RequestParam( value = "naam") String naam
    ) {
        return dao.findByNaam( naam );
    }

}
