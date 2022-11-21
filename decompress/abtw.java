import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtw extends ume
{
    public final void J(final Deque deque, final Attributes attributes, final String s) {
        final abul abul = deque.peekFirst();
        if (abul == null) {
            return;
        }
        final abuo abuo = new abuo();
        abuo.b = aana.g(attributes, 0, "id");
        abuo.g = abul.c(aana.g(attributes, 0, "p"));
        abuo.c = aana.i(attributes, 0L, "t");
        abuo.d = aana.i(attributes, Long.MAX_VALUE, "d");
        abuo.e = abul.e(aana.g(attributes, 0, "wp"));
        abuo.f = abul.f(aana.g(attributes, 0, "ws"));
        abuo.h = aana.g(attributes, 0, "rc");
        abuo.i = aana.g(attributes, 0, "cc");
        abul.d.put(abuo.b, abuo);
    }
}
