package ru.netology.Main;

import ru.netology.API.FormDate;
import ru.netology.API.Post;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Александр";
        post.patronymic = "Владимирович";
        post.surname = "Скударнов";
        post.birthday.day = 9;
        post.birthday.month = 3;
        post.birthday.year = 1934;
        post.passport = "1961 № 090334";
        post.phone = "+7 (921)-124-19-61";
        post.subscription = true;
    }

}
