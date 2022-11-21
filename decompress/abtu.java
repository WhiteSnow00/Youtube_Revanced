import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtu extends ume
{
    public final void J(final Deque deque, final Attributes attributes, String replaceAll) {
        final abul abul = deque.peekFirst();
        if (abul == null) {
            return;
        }
        final String value = attributes.getValue("p");
        abun abun;
        if (value != null) {
            abun = abul.c(twd.b(value, 0));
        }
        else {
            abun = abul.g;
        }
        final arlz arlz = new arlz((byte[])null, null);
        arlz.a = aana.g(attributes, 0, "t");
        aana.g(attributes, 0, "ac");
        final String a = abun.a();
        replaceAll = replaceAll.replaceAll("\n", "<br/>");
        final String b = abun.b();
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(replaceAll);
        sb.append(b);
        arlz.b = sb.toString();
        abul.e.add(arlz);
    }
}
