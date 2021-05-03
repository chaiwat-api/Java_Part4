public class main {
    public static void main(String[] args) {
        int x = 1;
        final int y = 2;

        System.out.println(++x);
        // System.out.println(++y); //ไม่สามารถเปลี่ยนแปลงค่า y ที่ประกาศเป็น final
        CompanyOwner Jack = new CompanyOwner() {
//            @Override  // ไม่สามารถ override method ที่ประกาศเป็น final
//            public void hello(){
//                System.out.println("Hi");
//            }
        };
        Jack.hello();
    }
}
