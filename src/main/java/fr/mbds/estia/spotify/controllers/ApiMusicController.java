package fr.mbds.estia.spotify.controllers;

import fr.mbds.estia.spotify.dtos.MusicDTO;
import fr.mbds.estia.spotify.services.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiMusicController {

    private final IMusicService musicService;

    @Autowired
    public ApiMusicController(IMusicService musicService) {
        this.musicService = musicService;
    }

    /**
     * On va gérer les 6 endpoints
     * GET, POST /musics
     * GET, PUT, PATCH, DELETE /music/{id}
     */


    // GET sur la collection
    @GetMapping(value = "/musics", produces = {"application/json","application/xml"})
    public List<MusicDTO> getMusics()
    {
        return musicService.getMusics();
    }

    // POST sur la collection
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/musics")
    public MusicDTO createMusic(@RequestBody MusicDTO musicDTO)
    {
        MusicDTO savedMusicDTO = musicService.createMusic(musicDTO);
        if (savedMusicDTO == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Music not created");
        return savedMusicDTO;
    }

    // GET sur le Singleton
    @GetMapping("/music/{id}")
    public MusicDTO getMusic(@PathVariable Long id)
    {
        MusicDTO musicDTO = musicService.getMusic(id);
        if (musicDTO == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Music not found");
        return musicDTO;
    }

    // PUT sur le Singleton
    @PutMapping("/music/{id}")
    public MusicDTO editMusicFull(@PathVariable Long id, @RequestBody MusicDTO musicDTO)
    {
        return musicService.editFullMusic(id, musicDTO);
    }

    // PATCH sur le Singleton
    @PatchMapping("/music/{id}")
    public MusicDTO editMusic(@PathVariable Long id, @RequestBody MusicDTO musicDTO)
    {
        return musicService.editMusic(id, musicDTO);
    }

    // DELETE sur le Singleton
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/music/{id}")
    public void deleteMusic(@PathVariable Long id)
    {
        musicService.deleteMusic(id);
    }
}
