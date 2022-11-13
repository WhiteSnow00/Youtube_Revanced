import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absn extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, final String s) {
        final abtb abtb = deque.peekFirst();
        if (abtb == null) {
            return;
        }
        final int g = aale.g(attributes, 0, new String[] { "ws" });
        abtg abtg;
        if (g != 0) {
            abtg = new abtg(abtb.f(g));
        }
        else {
            abtg = new abtg();
        }
        abtg.b = aale.g(attributes, 0, new String[] { "id" });
        abtg.c = aale.g(attributes, 0, new String[] { "mh" });
        abtg.d = aale.g(attributes, 2, new String[] { "ju" });
        abtg.e = aale.g(attributes, 0, new String[] { "pd" });
        abtg.f = aale.g(attributes, 3, new String[] { "sd" });
        abtg.g = aale.g(attributes, 0, new String[] { "wfc" });
        abtg.h = aale.g(attributes, 255, new String[] { "wfo" });
        abtg.i = aale.g(attributes, 0, new String[] { "wbt" });
        abtg.j = aale.g(attributes, 16777215, new String[] { "wbc" });
        abtb.b.put(abtg.b, abtg);
    }
}
