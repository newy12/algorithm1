public class Test {
    public static void main(String[] args) {
        class A{
            public int x = 0;
            public int y = 0;
        }
        class B extends A {
            public int x,y;

            B(int x, int y){
                this.x = x;
                this.y = y;
            }
            void print()
            {
                System.out.println("Base class  : {" + x + ", " + y + "}");
                System.out.println("Base class  : {" + this.x + ", " + this.y + "}");
                System.out.println("Super class: {" + super.x + ", " + super.y + "}");
                //주석지우기
            }
        }

        B obj = new B(1, 2);
        obj.print();
    }
}


