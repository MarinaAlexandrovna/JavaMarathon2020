package day3;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название города или stop, чтобы прервать программу");
        String city = sc.nextLine();


        switch (city) {
            case "Москва":
            case "Влодивосток":
            case "Ростов":
                System.out.println("Россия");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;
            case "Ливерпуль":
            case "Менчестер":
            case "Лондон":
                System.out.println("Англия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кельн":
                System.out.println("Гремания");
                break;
            default:
                System.out.println("Неизвестная страна");
            case "stop":
                break;
        }
        System.out.println();
    }
}


    }
}
