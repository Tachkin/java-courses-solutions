package ru.lesson.lessons.utils.validator;

/**
 * Утилитарный класс, проверяющий валидность имен клиентов и животных
 * Created by Tachkin's on 16.05.2017.
 */
public class NameValidator {

    /**
     * Валидность имени клиента
     *
     * @param name Имя клиента для валидации
     * @return валидность имени
     */
    public static boolean clientNameValidate(String name) {
        boolean responce = false;
        char first = name.charAt(0);
        responce = first == Character.toUpperCase(first); //начинается с прописной буквы
        return name.length() > 1 ? responce : false; // больше 1 буквы
    }

    public static boolean patNameValidate(String name) {
        char first = name.charAt(0);
        return first == Character.toUpperCase(first); //начинается с прописной буквы
    }



}
