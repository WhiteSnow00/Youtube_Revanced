import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abts extends ume
{
    public final void J(final Deque deque, final Attributes attributes, final String s) {
        final abuj abuj = deque.peekFirst();
        if (abuj == null) {
            return;
        }
        final String j = aana.j(attributes, "start");
        if (j == null) {
            return;
        }
        final int h = aana.h(Float.parseFloat(j));
        int n = 0;
        float a;
        while (true) {
            a = 5.0f;
            if (n > 0) {
                break;
            }
            final String value = attributes.getValue((new String[] { "dur" })[n]);
            if (value != null) {
                a = twd.a(value, 5.0f);
                break;
            }
            ++n;
        }
        abuj.c(0, s.replaceAll("\n", "<br/>"), h, aana.h(a) + h);
    }
}
