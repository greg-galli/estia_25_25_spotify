package fr.mbds.estia.spotify.dtos;

import fr.mbds.estia.spotify.entities.Album;
import fr.mbds.estia.spotify.entities.Artist;
import lombok.*;

import java.util.List;

@Data @Builder
public class MusicDTO {
    private Long id;
    private String title;
    private Integer trackLength;
    private String genre;
    private List<Artist> artists;
    private List<Album> albums;
}
