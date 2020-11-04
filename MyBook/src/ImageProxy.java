public class ImageProxy implements Element{
    String url;
    int dim;
    Image realimg;

    public ImageProxy(String url){
        this.url = url;
    }

    Image loadImage(){
        if (realimg == null){
            realimg = new Image(url);
        }
        return realimg;
    }

    @Override
    public void print() {
        loadImage().print();
    }
}
