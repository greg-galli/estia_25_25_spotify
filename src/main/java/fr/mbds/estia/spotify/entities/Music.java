package fr.mbds.estia.spotify.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString @Builder
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer trackLength;

    private String genre;

    @ManyToMany
    private List<Artist> artists;

    @ManyToMany
    private List<Album> albums;
}
