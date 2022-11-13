import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absj extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, String replaceAll) {
        final abtb abtb = deque.peekFirst();
        if (abtb == null) {
            return;
        }
        final String value = attributes.getValue("p");
        abtd abtd;
        if (value != null) {
            abtd = abtb.c(tvb.b(value, 0));
        }
        else {
            abtd = abtb.g;
        }
        final arjf arjf = new arjf((byte[])null, (byte[])null);
        arjf.a = aale.g(attributes, 0, new String[] { "t" });
        aale.g(attributes, 0, new String[] { "ac" });
        final String a = abtd.a();
        replaceAll = replaceAll.replaceAll("\n", "<br/>");
        final String b = abtd.b();
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(replaceAll);
        sb.append(b);
        arjf.b = sb.toString();
        abtb.e.add(arjf);
    }
}
