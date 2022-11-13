import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absm extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, final String s) {
        final abtb abtb = deque.peekFirst();
        if (abtb == null) {
            return;
        }
        final int g = aale.g(attributes, 0, new String[] { "wp" });
        abtf abtf;
        if (g != 0) {
            abtf = new abtf(abtb.e(g));
        }
        else {
            abtf = new abtf();
        }
        abtf.b = aale.g(attributes, 0, new String[] { "id" });
        abtf.c = aale.f(aale.g(attributes, 7, new String[] { "ap" }));
        abtf.d = aale.g(attributes, 100, new String[] { "av" });
        abtf.e = aale.g(attributes, 50, new String[] { "ah" });
        abtf.f = aale.g(attributes, 0, new String[] { "rc" });
        abtf.g = aale.g(attributes, 0, new String[] { "cc" });
        abtb.c.put(abtf.b, abtf);
    }
}
