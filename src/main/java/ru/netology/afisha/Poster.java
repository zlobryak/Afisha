package ru.netology.afisha;

public class Poster {
  private PosterItem[] items = new PosterItem[0];

  public void AddPosterItem(PosterItem item) {
    PosterItem[] tmp = new PosterItem[items.length + 1];
    for (int i = 0; i < items.length; i++) {
      tmp[i] = items[i];
    }
    tmp[tmp.length - 1] = item;
    items = tmp;
  }

  public PosterItem[] findAll() {
    return items;
  }
//
//
//  public PosterItem[] findLast {
//
//  }
}
