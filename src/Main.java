public class Main {
    public static void main(String[] args) {
        // Создаем объект сервиса для расчета BMI
        BmiService service = new BmiService();

        // Пример: масса 98 кг, рост 1.87 м
        double weight = 98;   // в килограммах
        double height = 1.87; // в метрах

        // Вызываем метод calculate и получаем результат
        int bmi = service.calculate(weight, height);

        // Выводим результат
        System.out.println("Индекс массы тела (BMI): " + bmi);  // Ожидаемый вывод: 28
    }
}
