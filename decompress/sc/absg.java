import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absg extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, final String s) {
        if ("3".equals(attributes.getValue("format"))) {
            final abtb abtb = deque.peekFirst();
            if (abtb == null) {
                return;
            }
            final abtc f = abtb.f;
            if (f != null) {
                abtb.g(f);
            }
        }
        deque.pollFirst();
    }
    
    public final void aW(final Deque deque, final Attributes attributes) {
        if ("3".equals(attributes.getValue("format"))) {
            deque.offerFirst(new abtb());
            return;
        }
        deque.offerFirst(new absz());
    }
}
