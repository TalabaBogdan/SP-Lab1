public class AlignCenter implements AlignStrategy{

    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Center " + paragraph.getpText());
    }
}
