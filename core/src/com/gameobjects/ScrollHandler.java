package com.gameobjects;

public class ScrollHandler {
    // ScrollHandler создаст все необходимые нам объекты
    private Grass frontGrass, backGrass;
    private Pipe pipe1, pipe2, pipe3;

    // ScrollHandler будет использовать следующие константы
    // чтобы определить, как быстро на перемещать объекты
    // и какой промежуток между трубами

    // заглавные буквы используются по договоренности об именовании переменных
    public static final int SCROLL_SPEED = -59;
    public static final int PIPE_GAP = 49;

    // конструктор получает значение по Y оси, где нам необходимо создать наши
    // Grass и Pipe объекты.
    public ScrollHandler(float yPos) {
    }

    public void update(float delta) {

    }

    // методы доступа к переменным класса
    public Grass getFrontGrass() {
        return frontGrass;
    }

    public Grass getBackGrass() {
        return backGrass;
    }

    public Pipe getPipe1() {
        return pipe1;
    }

    public Pipe getPipe2() {
        return pipe2;
    }

    public Pipe getPipe3() {
        return pipe3;
    }
}
