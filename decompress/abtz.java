import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtz extends ume
{
    public final void J(final Deque deque, final Attributes attributes, final String s) {
        final abul abul = deque.peekFirst();
        if (abul == null) {
            return;
        }
        final abun abun = new abun(abul.c(aana.g(attributes, 0, "p")));
        abun.b = aana.g(attributes, 0, "id");
        abun.c = aana.l(attributes, new String[] { "i" });
        abun.d = aana.l(attributes, new String[] { "u" });
        abun.e = aana.l(attributes, new String[] { "b" });
        abun.f = aana.g(attributes, 1, "of");
        abun.g = aana.g(attributes, 100, "sz");
        abun.h = aana.g(attributes, 0, "et");
        abun.n = aana.k(attributes, "#000000", "ec");
        abun.i = aana.g(attributes, 0, "fs");
        abun.j = aana.k(attributes, "#FFFFFF", "fc");
        abun.k = aana.g(attributes, 255, "fo");
        abun.l = aana.k(attributes, "#000000", "bc");
        abun.m = aana.g(attributes, 255, "bo");
        abul.a.put(abun.b, abun);
    }
}
