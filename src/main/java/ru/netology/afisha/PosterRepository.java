package ru.netology.afisha;

public class PosterRepository {
    private PosterItem[] items = new PosterItem[0];
    private int resultLenght;

    public int getResultLenght() {
        return resultLenght;
    }

    public PosterRepository(int resultLenght) {
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
        PosterItem[] tmp = new PosterItem[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            tmp[i] = items[resultLenght - i - 1];
        }
        return tmp;
    }

    public PosterItem findById(int id) {
        PosterItem desiredItem = null;
        for (PosterItem item : items) {
            if (item.getId() == id) {
                desiredItem = item;
            }
        }
        return desiredItem;
    }

    public void removeById(int id) {
        PosterItem[] tmp = new PosterItem[items.length - 1];
        int copyToIndex = 0;
        for (PosterItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        items = new PosterItem[0];
    }
}
