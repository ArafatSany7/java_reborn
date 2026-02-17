interface payment {
    String pay(double amount);

    String invoice(double amount);
}

class creditCardPayment implements payment {
    public String pay(double a) {
        return "paid by Card" + a;
    }

    public String invoice(double a) {
        return "Ivoice for " + a;
    }
}

class payPalPayment implements payment {
    public String pay(double a) {
        return "paid by Paypal " + a;
    }

    public String invoice(double a) {
        return "Invoce for " + a;
    }
}

class bankTransferSystem implements payment {
    public String pay(double a) {
        return "Paid by Bank " + a;
    }

    public String invoice(double a) {
        return "Invoice for " + a;
    }
}

class paymentFactory {
    public static payment create(String method) {
        return switch (method) {
            case "card" -> new creditCardPayment();
            case "payPal" -> new payPalPayment();
            case "Bank" -> new bankTransferSystem();
            default -> throw new IllegalArgumentException("Unknown Method" + method);
        };
    }
}

class MarketPlace {
    // public String pay(String method, double amount) {
    // payment pm = paymentFactory.create(method);
    // return pm.pay(amount);
    // }

    public static void main(String[] args) {
        payment bank = paymentFactory.create("Bank");
        payment card = paymentFactory.create("card");
        payment paypal = paymentFactory.create("payPal");

        System.out.println(card.pay(900));
        System.out.println(card.invoice(900));
    }
}