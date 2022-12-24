public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Пётр";
        post.surname = "Первый";
        post.patronymic = "Самый";

        post.passport = "1111№111111";
        post.phone = "+7(777)777-77-77";

        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 9;
        post.birthday.month = "October";
        post.birthday.year = 1672;

    }
}
