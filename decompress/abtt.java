import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtt extends ume
{
    public final void J(final Deque deque, final Attributes attributes, final String s) {
        deque.pollFirst();
    }
    
    public final void K(final Deque deque, final Attributes attributes) {
        deque.offerFirst(new abuj());
    }
}
