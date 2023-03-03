package ru.netology.afisha;

public class PosterItem {
  private int id;
  private String filmName;
  private int releaseYear;

  public PosterItem(int id, String filmName, int releaseYear) {
    this.id = id;
    this.filmName = filmName;
    this.releaseYear = releaseYear;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    if (id > 0) {
      this.id = id;
    } else {
      this.id = 0;
    }
  }

  public String getFilmName() {
    return filmName;
  }

  public void setFilmName(String filmName) {
    this.filmName = filmName;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    if (releaseYear > 1900 && releaseYear < 2050) {
      this.releaseYear = releaseYear;
    } else {
      this.releaseYear = 0;
    }
  }
}
