/**
 * Created by student on 08.11.2017.
 */
public interface Visitor {

    void visitImageProxy(ImageProxy imgp);
    void visitImage (Imagine img );
    void visitParagraf(Paragraf p);
    void visitTabel(Tabel t);
    void visitSectiune(Sectiune S);


}
