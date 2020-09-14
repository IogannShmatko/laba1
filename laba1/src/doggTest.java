class doggtest {
    public static void main(String[] args) {
        dogg d1 = new dogg("Mike", 2);
        dogg d2 = new dogg("Helen", 7);
        dogg d3 = new dogg("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        System.out.println(d2);
        d2.intoHumanAge();
        System.out.println(d3);
        d3.intoHumanAge();
    }
}

