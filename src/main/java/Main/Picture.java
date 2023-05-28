package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public enum Picture implements ImageObserver {
    CLOSED, //значение для картинки закрытого бокса
    DESTROY_SHIP, //для угичтоженной палубы корабля
    EMPTY, //для пустой клети
    NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10, //для нумерации стро игрового поля
    POINT, //для пустого отстрелянного бокса
    SHIP, //для палубы корабля
    INFO, //для информации на панели выбора настроек размещения кораблей
    SYM1, SYM2, SYM3, SYM4, SYM5, SYM6, SYM7, SYM8, SYM9, SYM10; //для обозначения буквами столбцов
    public static final int COLUMNS = 11; //кол-во столбцов
    public static final int ROWS = 11; //ол-во строк
    public static final int IMAGE_SIZE = 40; //размер стороны картинки в писелах
public Object image;



    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }
};


