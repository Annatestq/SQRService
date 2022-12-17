import ru.netology.sqr.SQRService.SQRService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int amount = service.function(10, 99);
        System.out.println(amount);

    }
}

