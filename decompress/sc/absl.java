import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absl extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, final String s) {
        final abtb abtb = deque.peekFirst();
        if (abtb == null) {
            return;
        }
        final abte abte = new abte();
        abte.b = aale.g(attributes, 0, new String[] { "id" });
        abte.g = abtb.c(aale.g(attributes, 0, new String[] { "p" }));
        abte.c = aale.i(attributes, 0L, new String[] { "t" });
        abte.d = aale.i(attributes, Long.MAX_VALUE, new String[] { "d" });
        abte.e = abtb.e(aale.g(attributes, 0, new String[] { "wp" }));
        abte.f = abtb.f(aale.g(attributes, 0, new String[] { "ws" }));
        abte.h = aale.g(attributes, 0, new String[] { "rc" });
        abte.i = aale.g(attributes, 0, new String[] { "cc" });
        abtb.d.put(abte.b, abte);
    }
}
