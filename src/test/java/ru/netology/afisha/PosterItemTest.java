package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterItemTest {

  PosterItem post = new PosterItem(1, "Терминатор 2: Судный день", 1991);

  @Test
  void getIdTest() {
    Assertions.assertEquals(1, post.getId());
  }

  @Test
  void setIdTest() {
    post.setId(11);
    Assertions.assertEquals(11, post.getId());
  }
  @Test
  void setIdTestBelow() {
    post.setId(-1);
    Assertions.assertEquals(0, post.getId());
  }

  @Test
  void getFilmNameTest() {
    Assertions.assertEquals("Терминатор 2: Судный день", post.getFilmName());
  }

  @Test
  void setFilmNameTest() {
    post.setFilmName("Форрест Гамп");
    Assertions.assertEquals("Форрест Гамп", post.getFilmName());
  }

  @Test
  void getReleaseYearTest() {
    Assertions.assertEquals(1991, post.getReleaseYear());
  }

  @Test
  void setReleaseYearBelowTest() {
    post.setReleaseYear(2022);
    Assertions.assertEquals(2022, post.getReleaseYear());
  }

  @Test
  void setReleaseYearAboveTest() {
    post.setReleaseYear(1899);
    Assertions.assertEquals(0, post.getReleaseYear());
  }

  @Test
  void setReleaseYearTest() {
    post.setReleaseYear(2051);
    Assertions.assertEquals(0, post.getReleaseYear());
  }
}