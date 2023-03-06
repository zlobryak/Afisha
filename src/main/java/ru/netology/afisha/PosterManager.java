package ru.netology.afisha;

public class PosterManager {
  private PosterRepository repo;

  public PosterManager(PosterRepository repo) {
    this.repo = repo;
  }

  public PosterItem[] findAll() {
    return repo.findAll();
  }

  public void save(PosterItem item) {
    repo.save(item);
  }

  public PosterItem findById(int id) {
    PosterItem[] items = repo.findAll();
    PosterItem desiredItem = null;
    for (PosterItem item : items) {
      if (item.getId() == id) {
        desiredItem = item;
      }
    }
    return desiredItem;
  }


  public void removeById(int id) {
    repo.removeById(id);
  }

  public void removeAll() {
    repo.removeAll();
  }

}
