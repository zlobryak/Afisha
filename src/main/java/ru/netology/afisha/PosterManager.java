package ru.netology.afisha;

public class PosterManager {
  private PosterRepisitory repo;
  public PosterManager(PosterRepisitory repo){
    this.repo = repo;
  }

  public PosterItem[] findAll() {
    PosterItem[] tmp = new PosterItem[repo.items.length];
    tmp = repo.findAll();
    return tmp[0];

  }

  public void save() {

  }

  public PosterItem[] findById() {

  }

  public void removeById() {

  }

  public void removeAll() {

  }
}
