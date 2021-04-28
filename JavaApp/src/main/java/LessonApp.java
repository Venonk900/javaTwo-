public class LessonApp {
    public static void main(String[] args) {
        User user = new AgedUser("name",15);

        if(user  instanceof AgedUser) {
            AgedUser agedUser = (AgedUser)user;
        }


        user.getClass().
    }


}
