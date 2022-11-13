import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abso extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, final String s) {
        final abtb abtb = deque.peekFirst();
        if (abtb == null) {
            return;
        }
        final abtd abtd = new abtd(abtb.c(aale.g(attributes, 0, new String[] { "p" })));
        abtd.b = aale.g(attributes, 0, new String[] { "id" });
        abtd.c = aale.l(attributes, new String[] { "i" });
        abtd.d = aale.l(attributes, new String[] { "u" });
        abtd.e = aale.l(attributes, new String[] { "b" });
        abtd.f = aale.g(attributes, 1, new String[] { "of" });
        abtd.g = aale.g(attributes, 100, new String[] { "sz" });
        abtd.h = aale.g(attributes, 0, new String[] { "et" });
        abtd.n = aale.k(attributes, "#000000", new String[] { "ec" });
        abtd.i = aale.g(attributes, 0, new String[] { "fs" });
        abtd.j = aale.k(attributes, "#FFFFFF", new String[] { "fc" });
        abtd.k = aale.g(attributes, 255, new String[] { "fo" });
        abtd.l = aale.k(attributes, "#000000", new String[] { "bc" });
        abtd.m = aale.g(attributes, 255, new String[] { "bo" });
        abtb.a.put(abtd.b, abtd);
    }
}
