package DZ_3;

import javax.xml.crypto.Data;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) throws InvalidDataException, ParseException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные в произвольном порядке (ФамилияИмяОтчество Дата_рождения Номер_телефона Пол):");
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");
            if (inputData.length != 4) {
                throw new InvalidDataException("Введите данные в формате: ФамилияИмяОтчество Дата_рождения Номер_телефона Пол");
            }
            String fullName = inputData[0];
            String birthDateStr = inputData[1];
            String phoneNumberStr = inputData[2];
            String genderStr = inputData[3];

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date birthDate = simpleDateFormat.parse(birthDateStr); // парсим дату рождения
            long phoneNumber = Long.parseLong(phoneNumberStr);
            if (!genderStr.equals("f") && !genderStr.equals("m")) {
                throw new InvalidDataException("Неверный формат пола. Используйте 'f' для женского и 'm' для мужского.");
            }
            Person person = new Person(fullName, birthDate, phoneNumber, genderStr);
            System.out.println(person.toString());

            String fileName = person.getFullName() + ".txt";
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(person.toString()); // Записываем данные в файл
                System.out.println("Данные успешно записаны в файл: " + fileName);
            } catch (IOException e) {
            }
        } catch (InvalidDataException | ParseException e) {
            System.out.println("Ошибка " + e.getMessage());
        }

    }
}
