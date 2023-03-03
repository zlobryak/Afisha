package ru.netology.afisha;

public class Poster {
  private PosterItem[] items = new PosterItem[0];
  private int resultLenght;

  public int getResultLenght() {
    return resultLenght;
  }
  public Poster(int resultLenght) {
    if (resultLenght > 0) {
      this.resultLenght = resultLenght;
    } else {
      this.resultLenght = 10;
    }
  }

  public void addPosterItem(PosterItem item) {
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

  public PosterItem[] findLast() {
    PosterItem[] tmp = new PosterItem[resultLenght];
    for (int i = 0; i < resultLenght; i++) {
      tmp[i] = items[resultLenght - i - 1];
    }
    return tmp;
  }
}
