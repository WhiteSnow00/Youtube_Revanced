import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absh extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, final String s) {
        final absz absz = deque.peekFirst();
        if (absz == null) {
            return;
        }
        final String j = aale.j(attributes, new String[] { "start" });
        if (j == null) {
            return;
        }
        final int h = aale.h(Float.parseFloat(j));
        int n = 0;
        float a;
        while (true) {
            a = 5.0f;
            if (n > 0) {
                break;
            }
            final String value = attributes.getValue((new String[] { "dur" })[n]);
            if (value != null) {
                a = tvb.a(value, 5.0f);
                break;
            }
            ++n;
        }
        absz.c(0, s.replaceAll("\n", "<br/>"), h, aale.h(a) + h);
    }
}
