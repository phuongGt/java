class test{
    public static void main(String s) {
        while (true) {
            boolean reduced = false;
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.delete(i, i + 2);
                    reduced = true;
                }
            }
            if (!reduced) {
                break;
            }
            s = sb.toString();
        }
        if (s.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(s);
        }
    }
    
}