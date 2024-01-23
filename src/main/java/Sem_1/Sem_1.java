package Sem_1;

public class Sem_1 {
    public static void main(String[] args) {
        //       System.out.println(task0(new int[]{0, 1, 2}));
        checkArray(new Integer[]{0, 1, 2, null, 2, 2, 4, null});

        int[][] args1 = {
                {0, 1, 0},
                {0, 1, 1},
                {0, 1, 1}
        };
//        System.out.println(task2(args1));

    }

    public static int task0(int[] arg) {
        return arg.length < 3 ? -1 : arg.length;
    }

    public static int task1(int[] arg, int value) {
        if (arg == null) return -3;
        if (task0(arg) == -1) return -1;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] == value) {
                return i;
            }
        }
        return -2;
    }

    public static int task2(int[][] arg) {
        int sum = 0;
        if (arg.length != arg[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[0].length; j++) {
                if (arg[i][j] != 1 & arg[i][j] != 0) {
                    throw new RuntimeException("В массиве не 1 или 0");
                }
                sum += arg[i][j];
            }
        }
        return sum;
    }

    public static void checkArray(Integer[] args) {
        for (int index = 0; index < args.length; index++) {
            try {
                int i = args[index];

            } catch (NullPointerException e) {
                System.out.println("Null в яйчейке: " + index);

            }
        }

    }
}
