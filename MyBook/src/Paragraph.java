public class Paragraph implements Element {
    String pText;
    Paragraph(String text) {
        this.pText = text;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "pText='" + pText + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}