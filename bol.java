import java.util.*;

public class BuggyLongCode {

    public static void main(String[] args) {
        System.out.println("Энэ код маш олон алдаатай!");
        
        int[] numbers = new int[10];
        for (int i = 0; i <= 10; i++) { // ArrayIndexOutOfBoundsException гарна
            numbers[i] = i * 2;
        }

        String nullString = null;
        System.out.println(nullString.length()); // NullPointerException

        divideByZero();
        recursiveMethod(1);
        infiniteLoop();
        incorrectLogic();
        missingReturnMethod();
        brokenMath();
        memoryLeak();

        List<Integer> list = null;
        list.add(10); // NullPointerException

        checkStringEquality();
        improperCasting();
        invalidIndexAccess();
        incorrectConditionCheck();
    }

    public static void divideByZero() {
        int a = 10;
        int b = 0;
        int c = a / b; // ArithmeticException үүсгэнэ
        System.out.println(c);
    }

    public static void recursiveMethod(int n) {
        if (n < 10000) {
            recursiveMethod(n + 1); // StackOverflowError үүсгэнэ
        }
    }

    public static void infiniteLoop() {
        while (true) {
            System.out.println("Эндээс гарч чадахгүй!");
        }
    }

    public static void incorrectLogic() {
        int age = -5;
        if (age > 0 && age < 10) {
            System.out.println("Насны логик буруу байна!");
        }
    }

    public static void missingReturnMethod() {
        int a = 10;
        int b = 20;
        int sum = a + b;
    } // return байхгүй

    public static void brokenMath() {
        int x = 10;
        int y = 5;
        int z = x / (y - 5); // Divide by zero болно
        System.out.println(z);
    }

    public static void memoryLeak() {
        List<int[]> leakList = new ArrayList<>();
        while (true) {
            leakList.add(new int[100000]); // Санах ойн алдаа үүсгэнэ
        }
    }

    public static void checkStringEquality() {
        String s1 = "test";
        String s2 = new String("test");
        if (s1 == s2) { // == биш, .equals() ашиглах ёстой
            System.out.println("Тэнцүү!");
        }
    }

    public static void improperCasting() {
        Object obj = new Integer(10);
        String str = (String) obj; // ClassCastException
        System.out.println(str);
    }

    public static void invalidIndexAccess() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.get(5)); // IndexOutOfBoundsException
    }

    public static void incorrectConditionCheck() {
        int x = 10;
        int y = 5;
        if (x = y) { // x = y биш, x == y байх ёстой
            System.out.println("Утга буруу оноож байна!");
        }
    }

    public static void undefinedMethod() {
        undefinedFunction(); // Ийм функц байхгүй тул алдаа гарна
    }

    public static void invalidCasting() {
        Object obj = new Integer(5);
        String str = (String) obj; // ClassCastException
    }

    public static void nullPointer() {
        BuggyLongCode obj = null;
        obj.toString(); // NullPointerException
    }

    public static void missingBreak() {
        int num = 2;
        switch (num) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
        } // Break байхгүй тул бүх тохиолдол ажиллана
    }

    public static void infiniteRecursion() {
        infiniteRecursion(); // StackOverflowError
    }

    public static void wrongDataType() {
        int a = "Hello"; // Инт хувьсагчид String оноож болохгүй
    }

    public static void invalidListOperation() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.remove(10); // IndexOutOfBoundsException
    }

    public static void wrongLoop() {
        for (int i = 0; i < 5; i--){ // Энэ давталт хэзээ ч зогсохгүй
            System.out.println("Wrong loop!");
        }
    }

    public static void invalidCondition() {
        boolean isTrue = 1; // boolean хувьсагчид int оноож болохгүй
    }

    public static void unreachableCode() {
        return;
        System.out.println("Энэ мөр хэзээ ч ажиллахгүй!");
    }

    public static void doubleDeclaration() {
        int x = 10;
        int x = 20; // Нэг хувьсагчийг хоёр дахин зарлах боломжгүй
    }

    public static void incorrectTryCatch() {
        try {
            int result = 10 / 0;
        } catch (NullPointerException e) { // Буруу exception төрлөөр барьж байна
            System.out.println("Алдаа!");
        }
    }

    public static void incorrectFinalVariable() {
        final int num = 10;
        num = 20; // final хувьсагчийг дахин оноох боломжгүй
    }

    public static void missingParameter(int x, int y) {
        int sum = x + y;
    } // Утга буцаахгүй, дуудахад алдаа өгнө

    public static void wrongStaticUsage() {
        static int value = 10; // static хувьсагчийг ингэж зарлаж болохгүй
    }

    public static void wrongMethodCall() {
        int result = nonExistentMethod(); // Ийм функц байхгүй тул алдаа гарна
    }

    public static void nullReferenceException() {
        String str = null;
        System.out.println(str.charAt(0)); // NullPointerException
    }
}
