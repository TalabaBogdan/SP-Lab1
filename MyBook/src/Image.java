public class Image implements Element {
    String image;
    Image(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Image{" +
                "image='" + image + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}