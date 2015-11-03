package Biblioteca;

public class layout {

    private String div;

    public void SetDiv(String Valor) {
        this.div = "<div>a<br><hr> " + Valor + " <div>";
    }

    public String GetDiv() {
        return this.div;
    }

    public String box_home(String img, String titulo, String link, String texto) {
        String ret = ""
                + "<div class=\"col-md-4 portfolio-left\">\n"
                + "            <div class=\"portfolio-img event-img\">\n"
                + "                <img src=\"images/t10.jpg\" class=\"img-responsive\" alt=\"\"/>\n"
                + "                 <div class=\"over-image\"></div>\n"
                + "            </div>\n"
                + "            <div class=\"portfolio-description\">\n"
                + "               <h4><a href=\"#\">Lorem Ipsum</a></h4>\n"
                + "               <p>Mauris diam massa, malesuada a sapien in, semper vehicula erat. Vivamus sagittis leo a ullamcorper ultricies. Suspendisse placerat mattis arcu nec por</p>\n"
                + "               <span>\n"
                + "                  <a href=\"students.html\">School Studies</a>\n"
                + "                  <a href=\"students.html\">College Studies</a>\n"
                + "                </span>\n"
                + "                <a href=\"events.html\">\n"
                + "                    <span><i class=\"fa fa-chain chain_1\"></i>VIEW PROJECT</span>\n"
                + "                </a>\n"
                + "            </div>\n"
                + "            <div class=\"clearfix\"> </div>\n"
                + "        </div>";

        return ret;
    }

}
