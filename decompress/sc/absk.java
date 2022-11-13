import java.util.ArrayList;
import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absk extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, final String s) {
        final abtb abtb = deque.peekFirst();
        if (abtb == null) {
            return;
        }
        final abtd g = abtb.g;
        final abte d = abtb.d(aale.g(attributes, 0, new String[] { "w" }));
        abtf f;
        if (d != null) {
            f = d.e;
        }
        else {
            f = abtb.e(aale.g(attributes, 0, new String[] { "wp" }));
        }
        abtg g2;
        if (d != null) {
            g2 = d.f;
        }
        else {
            g2 = abtb.f(aale.g(attributes, 0, new String[] { "ws" }));
        }
        final abtc f2 = new abtc();
        f2.e = g;
        f2.a = aale.i(attributes, 0L, new String[] { "t" });
        f2.b = aale.i(attributes, 0L, new String[] { "d" });
        abte a = d;
        if (d == null) {
            a = abte.a;
        }
        f2.c = a;
        f2.d = aale.l(attributes, new String[] { "a" });
        f2.f = f;
        f2.g = g2;
        f2.h = aale.g(attributes, 0, new String[] { "rc" });
        f2.i = aale.g(attributes, 0, new String[] { "cc" });
        final String a2 = g.a();
        final String replaceAll = s.replaceAll("\n", "<br/>");
        final String b = g.b();
        final StringBuilder sb = new StringBuilder();
        sb.append(a2);
        sb.append(replaceAll);
        sb.append(b);
        f2.k = sb.toString();
        final abtc f3 = abtb.f;
        if (f3 != null) {
            if (f3.b == 0L) {
                f3.b = f2.a - f3.a;
            }
            abtb.g(f3);
        }
        abtb.f = f2;
        f2.j = abtb.e;
        abtb.e = new ArrayList();
        abtb.g = abtd.a;
    }
    
    public final void aW(final Deque deque, final Attributes attributes) {
        final abtb abtb = deque.peekFirst();
        if (abtb == null) {
            return;
        }
        final abte d = abtb.d(aale.g(attributes, 0, new String[] { "w" }));
        final String value = attributes.getValue("p");
        abtd g;
        if (value != null) {
            g = abtb.c(tvb.b(value, 0));
        }
        else if (d != null) {
            g = d.g;
        }
        else {
            g = abtb.c(0);
        }
        abtb.g = g;
    }
}
