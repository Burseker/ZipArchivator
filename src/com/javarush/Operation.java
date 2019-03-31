package com.javarush;

public enum Operation {
    CREATE("упаковать файлы в архив"),
    ADD("добавить файл в архив"),
    REMOVE("удалить файл из архива"),
    EXTRACT("распаковать архив"),
    CONTENT("просмотреть содержимое архива"),
    EXIT("выход");

    private String text;

    private Operation(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
