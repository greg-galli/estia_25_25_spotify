package fr.mbds.estia.spotify.services;

import fr.mbds.estia.spotify.dtos.MusicDTO;
import fr.mbds.estia.spotify.entities.Music;

import java.util.List;

public interface IMusicService {
    MusicDTO getMusic(Long id);
    MusicDTO createMusic(Music music);
}
