public class Paragraph implements Element {
    String pText;
    AlignStrategy alignStrategy;

    Paragraph(String text) {
        this.pText = text;
    }

    public void setAlignStrategy(AlignStrategy strategy){
        alignStrategy = strategy;
    }

    public String getpText() {
        return pText;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "pText='" + pText + '\'' +
                '}';
    }

    @Override
    public void print() {
        if (alignStrategy != null){
            alignStrategy.render(this, new Context());
            return;
        }
        System.out.println(this.toString());
    }
}