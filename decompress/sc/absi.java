import org.xml.sax.Attributes;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absi extends vdh
{
    public final void aV(final Deque deque, final Attributes attributes, final String s) {
        deque.pollFirst();
    }
    
    public final void aW(final Deque deque, final Attributes attributes) {
        deque.offerFirst(new absz());
    }
}
