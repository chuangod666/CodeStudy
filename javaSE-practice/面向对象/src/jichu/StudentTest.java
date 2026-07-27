package jichu;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student student1 = new Student(1, "小明", 16);
        Student student2 = new Student(2, "小张", 39);
        Student student3 = new Student(3, "小红", 18);
        arr[0] = student1;
        arr[1] = student2;
        arr[2] =  student3;

        Student student4 = new Student(4, "小李", 16);
        //唯一性判断
        boolean flag = contains(arr, student4.getId());
        if (flag) {
            System.out.println("学生id已存在");      //先判断存不存在再判断数组有没有存满
        }else {
            int count = getCount(arr);
            if (count == arr.length) {
            Student [] newArr = creatNewArr(arr);
            newArr [count] = student4;
            arr = newArr;
            printArr(newArr);
            }else{
                arr[count] = student4;
                 printArr(arr);
            }
        }
        int index = getIndex(arr, 3);
        if (index >= 0){
            arr[index] = null;
            printArr(arr);
        }else  {
            System.out.println("不存在此id");
        }
        //将2索引的年龄加一
        int id = getIndex(arr, 2);
        if (id >= 0){
            Student stu = arr[id];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            printArr(arr);

        }

    }
    public static Student[] creatNewArr(Student[] arr) { //创建新数组
        Student[] newArr = new Student[arr.length +1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(Student[] arr) {  //遍历
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getName() + " " + arr[i].getAge() + " " + arr[i].getId());
            }
        }
    }


    public static int getCount(Student[]arr) {     //判断是否存满
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
            count++;
            }
        }
        return count;
    }


    public static boolean contains(Student[]arr,int id){ //判断是否重复id
        for(int i=0;i<arr.length;i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int getIndex(Student[]arr,int id){
        for(int i=0;i<arr.length;i++) {
            Student stu = arr[i];
            if (stu == arr[id]) {
                return i;
            }
        }
        return -1;
    }
}

