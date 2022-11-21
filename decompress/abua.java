import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abua extends ume
{
    public final void J(final Deque deque, final Attributes attributes, String replaceAll) {
        final abuj abuj = deque.peekFirst();
        if (abuj == null) {
            return;
        }
        final int g = aana.g(attributes, 0, "w", "win");
        final String j = aana.j(attributes, "t", "start");
        if (j == null) {
            return;
        }
        final int int1 = Integer.parseInt(j);
        final int g2 = aana.g(attributes, 0, "d", "dur");
        replaceAll = replaceAll.replaceAll("\n", "<br/>");
        if (aana.j(attributes, "append") == null) {
            abuj.c(g, replaceAll, int1, g2 + int1);
            return;
        }
        abuj.b(g).c(replaceAll, int1, g2 + int1);
    }
}
