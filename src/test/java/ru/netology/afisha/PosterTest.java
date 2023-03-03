package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterTest {
  Poster poster = new Poster();
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
    poster.AddPosterItem(item1);
    poster.AddPosterItem(item2);
    poster.AddPosterItem(item3);

    PosterItem[] expected = {item1, item2, item3};
    PosterItem[] actual = poster.findAll();

    Assertions.assertArrayEquals(expected, actual);
  }
}