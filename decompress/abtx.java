import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtx extends ume
{
    public final void J(final Deque deque, final Attributes attributes, final String s) {
        final abul abul = deque.peekFirst();
        if (abul == null) {
            return;
        }
        final int g = aana.g(attributes, 0, "wp");
        abup abup;
        if (g != 0) {
            abup = new abup(abul.e(g));
        }
        else {
            abup = new abup();
        }
        abup.b = aana.g(attributes, 0, "id");
        abup.c = aana.f(aana.g(attributes, 7, "ap"));
        abup.d = aana.g(attributes, 100, "av");
        abup.e = aana.g(attributes, 50, "ah");
        abup.f = aana.g(attributes, 0, "rc");
        abup.g = aana.g(attributes, 0, "cc");
        abul.c.put(abup.b, abup);
    }
}
