import java.util.ArrayList;
import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtv extends ume
{
    public final void J(final Deque deque, final Attributes attributes, final String s) {
        final abul abul = deque.peekFirst();
        if (abul == null) {
            return;
        }
        final abun g = abul.g;
        final abuo d = abul.d(aana.g(attributes, 0, "w"));
        abup f;
        if (d != null) {
            f = d.e;
        }
        else {
            f = abul.e(aana.g(attributes, 0, "wp"));
        }
        abuq g2;
        if (d != null) {
            g2 = d.f;
        }
        else {
            g2 = abul.f(aana.g(attributes, 0, "ws"));
        }
        final abum f2 = new abum();
        f2.e = g;
        f2.a = aana.i(attributes, 0L, "t");
        f2.b = aana.i(attributes, 0L, "d");
        abuo a = d;
        if (d == null) {
            a = abuo.a;
        }
        f2.c = a;
        f2.d = aana.l(attributes, new String[] { "a" });
        f2.f = f;
        f2.g = g2;
        f2.h = aana.g(attributes, 0, "rc");
        f2.i = aana.g(attributes, 0, "cc");
        final String a2 = g.a();
        final String replaceAll = s.replaceAll("\n", "<br/>");
        final String b = g.b();
        final StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append(replaceAll);
        sb.append(b);
        f2.k = sb.toString();
        final abum f3 = abul.f;
        if (f3 != null) {
            if (f3.b == 0L) {
                f3.b = f2.a - f3.a;
            }
            abul.g(f3);
        }
        abul.f = f2;
        f2.j = abul.e;
        abul.e = new ArrayList();
        abul.g = abun.a;
    }
    
    public final void K(final Deque deque, final Attributes attributes) {
        final abul abul = deque.peekFirst();
        if (abul == null) {
            return;
        }
        final abuo d = abul.d(aana.g(attributes, 0, "w"));
        final String value = attributes.getValue("p");
        abun g;
        if (value != null) {
            g = abul.c(twd.b(value, 0));
        }
        else if (d != null) {
            g = d.g;
        }
        else {
            g = abul.c(0);
        }
        abul.g = g;
    }
}
