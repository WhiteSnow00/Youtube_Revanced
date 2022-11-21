import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtr extends ume
{
    public final void J(final Deque deque, final Attributes attributes, final String s) {
        if ("3".equals(attributes.getValue("format"))) {
            final abul abul = deque.peekFirst();
            if (abul == null) {
                return;
            }
            final abum f = abul.f;
            if (f != null) {
                abul.g(f);
            }
        }
        deque.pollFirst();
    }
    
    public final void K(final Deque deque, final Attributes attributes) {
        if ("3".equals(attributes.getValue("format"))) {
            deque.offerFirst(new abul());
            return;
        }
        deque.offerFirst(new abuj());
    }
}
