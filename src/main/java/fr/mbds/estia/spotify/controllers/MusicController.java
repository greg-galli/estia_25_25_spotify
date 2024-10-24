package fr.mbds.estia.spotify.controllers;

import fr.mbds.estia.spotify.dtos.MusicDTO;
import fr.mbds.estia.spotify.entities.Music;
import fr.mbds.estia.spotify.repositories.MusicRepository;
import fr.mbds.estia.spotify.services.IMusicService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/musics")
@RestController
public class MusicController {

    private final IMusicService musicService;

    public MusicController(IMusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/{id}")
    public MusicDTO getMusic(@PathVariable Long id) {
        return musicService.getMusic(id);
    }

    @PostMapping
    public MusicDTO createMusic(@RequestBody Music music) {
        return musicService.createMusic(music);
    }
}
