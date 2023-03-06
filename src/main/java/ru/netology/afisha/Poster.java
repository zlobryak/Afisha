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

  public void save(PosterItem item) {
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
    int tmpLenght;

    if (resultLenght <= items.length) {
      tmpLenght = resultLenght;
    } else {
      tmpLenght = items.length;
    }

    PosterItem[] tmp = new PosterItem[tmpLenght];
    for (int i = 0; i < tmpLenght; i++) {
      tmp[i] = items[tmpLenght - i - 1];
    }
    return tmp;
  }
}
