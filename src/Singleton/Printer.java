package Singleton;

public class Printer {

    private static Printer instance;

    private Printer() {}

    public static Printer getInstance() {
        if(instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void connect() {

    }

    class Employee {
        public void print() {
            Printer p = new Printer();
            p.connect();
        }
    }
}
// 1. Tạo đối tượng duy nhất trong chính lớp đó ko cho lớp khác tự do tao;

// 2. Tạo phương thức khởi tạo (API) để tạo Obj/ nếu Obj == null thì khởo Obj thực;

// 3. Taị 1 thời điểm chỉ tạo Obj duy nhất;

// 4. Obj cũng là duy nhất trong hệ thống;

// 5. Hàm khởi tạo cũng private để tránh hạn chế khởi tạo Obj;
