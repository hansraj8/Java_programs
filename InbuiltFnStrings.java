public class InbuiltFnStrings {
    public static void main(String[] args) {
        String s = "Hi my name is hansraj";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);

        String state = "I love mango shake";
        System.out.println(state.length());
        System.out.println(state.strip());
        System.out.println(state);
        state = state.replace("mango", "apple");
        System.out.println(state);

    }
}
