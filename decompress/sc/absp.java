import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absp extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, String replaceAll) {
        final absz absz = deque.peekFirst();
        if (absz == null) {
            return;
        }
        final int g = aale.g(attributes, 0, new String[] { "w", "win" });
        final String j = aale.j(attributes, new String[] { "t", "start" });
        if (j == null) {
            return;
        }
        final int int1 = Integer.parseInt(j);
        final int g2 = aale.g(attributes, 0, new String[] { "d", "dur" });
        replaceAll = replaceAll.replaceAll("\n", "<br/>");
        if (aale.j(attributes, new String[] { "append" }) == null) {
            absz.c(g, replaceAll, int1, g2 + int1);
            return;
        }
        absz.b(g).c(replaceAll, int1, g2 + int1);
    }
}
