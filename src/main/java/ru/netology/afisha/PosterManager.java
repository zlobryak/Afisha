package ru.netology.afisha;

public class PosterManager {
  private PosterRepository repo;

  public PosterManager(PosterRepository repo) {
    this.repo = repo;
  }

  public PosterItem[] findAll() {
    PosterItem[] tmp = repo.findAll();
    return tmp;
  }

  public void save(PosterItem item) {
    repo.save(item);
  }

  public PosterItem findById(int id) {
    PosterItem item = repo.findById(id);
    return item;
  }

  public void removeById(int id) {
    repo.findById(id);
  }

  public void removeAll() {
    repo.removeAll();
  }

}
