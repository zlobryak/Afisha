package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PosterTest {
  PosterRepisitory PosterRepisitory = new PosterRepisitory(10);
  PosterItem item1 = new PosterItem(1, "Спайдерхед", 2022);
  PosterItem item2 = new PosterItem(2, "Властелин колец 3: Возвращение Короля", 2003);
  PosterItem item3 = new PosterItem(3, "Терминатор 2: Судный день", 1991);
  PosterItem item4 = new PosterItem(4, "Побег из Шоушенка", 1994);
  PosterItem item5 = new PosterItem(5, "Форрест Гамп", 1994);
  PosterItem item6 = new PosterItem(6, "Властелин колец 2: Две крепости", 2002);
  PosterItem item7 = new PosterItem(7, "Властелин колец: Братство кольца", 2001);
  PosterItem item8 = new PosterItem(8, "Титаник", 1997);
  PosterItem item9 = new PosterItem(9, "Настоящая любовь", 1993);
  PosterItem item10 = new PosterItem(10, "12 разгневанных мужчин", 1957);
  PosterItem item11 = new PosterItem(11, "Зеленая миля ", 1999);
  PosterItem item12 = new PosterItem(12, "Матрица ", 1999);
  PosterItem item13 = new PosterItem(13, "Крестный отец", 1972);


  @Test
  void addPosterItemTest() {
    PosterRepisitory.addPosterItem(item1);
    PosterRepisitory.addPosterItem(item2);
    PosterRepisitory.addPosterItem(item3);

    PosterItem[] expected = {item1, item2, item3};
    PosterItem[] actual = PosterRepisitory.findAll();

    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void findLastTest() {
    PosterRepisitory.addPosterItem(item1);
    PosterRepisitory.addPosterItem(item2);
    PosterRepisitory.addPosterItem(item3);
    PosterRepisitory.addPosterItem(item4);
    PosterRepisitory.addPosterItem(item5);
    PosterRepisitory.addPosterItem(item6);
    PosterRepisitory.addPosterItem(item7);
    PosterRepisitory.addPosterItem(item8);
    PosterRepisitory.addPosterItem(item9);
    PosterRepisitory.addPosterItem(item10);
    PosterRepisitory.addPosterItem(item11);
    PosterRepisitory.addPosterItem(item12);
    PosterRepisitory.addPosterItem(item13);


    PosterItem[] expected = {item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
    PosterItem[] actual = PosterRepisitory.findLast();

    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void getResultLenght() {
    Assertions.assertEquals(10, PosterRepisitory.getResultLenght());
  }

  @Test
  void resultLenghtBelowTest() {
    PosterRepisitory PosterRepisitory = new PosterRepisitory(-1);
    Assertions.assertEquals(10, PosterRepisitory.getResultLenght());
  }
}