import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abty extends ume
{
    public final void J(final Deque deque, final Attributes attributes, final String s) {
        final abul abul = deque.peekFirst();
        if (abul == null) {
            return;
        }
        final int g = aana.g(attributes, 0, "ws");
        abuq abuq;
        if (g != 0) {
            abuq = new abuq(abul.f(g));
        }
        else {
            abuq = new abuq();
        }
        abuq.b = aana.g(attributes, 0, "id");
        abuq.c = aana.g(attributes, 0, "mh");
        abuq.d = aana.g(attributes, 2, "ju");
        abuq.e = aana.g(attributes, 0, "pd");
        abuq.f = aana.g(attributes, 3, "sd");
        abuq.g = aana.g(attributes, 0, "wfc");
        abuq.h = aana.g(attributes, 255, "wfo");
        abuq.i = aana.g(attributes, 0, "wbt");
        abuq.j = aana.g(attributes, 16777215, "wbc");
        abul.b.put(abuq.b, abuq);
    }
}
