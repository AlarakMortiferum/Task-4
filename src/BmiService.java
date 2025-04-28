public class BmiService {

    // Метод для расчета индекса массы тела (BMI)
    public int calculate(double weight, double height) {
        // Рассчитываем BMI по формуле: масса / (рост * рост)
        double index = weight / (height * height);

        // Приводим результат к целому числу
        return (int) index;
    }
}
