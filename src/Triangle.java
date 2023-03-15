public class Triangle {

    public static String TriangleClassifier(int a, int b, int c){
        if(a>=(b+c)||b>=(a+c)||c>=(a+b)||a<=0||b<=0||c<=0){
            return "Ko phải là tam giác";
        } else if(a==b&&a==c&b==c)
            return "Tam giác đều";
            else if(a==b||b==c||a==c)
                return "Tam giác cân";
        else return "Tam giác thường";
    }
}
