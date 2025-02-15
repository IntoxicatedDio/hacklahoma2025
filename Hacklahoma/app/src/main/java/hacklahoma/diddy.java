public Class DiddyKong extends JPanel{
    //Diddy Image
    Image img;
    DK dk;
    
    //DK Image
    public DK{
        DK(Image img){
            this.img = img;
        }
    }

    //Default Constructor
    DiddyKong() {
        dkImg = new ImageIcon(getClass().getResource("./image.png")).getImage();
        dk = new DK(dkImg);
    }
}