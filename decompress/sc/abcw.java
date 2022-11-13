import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcw implements abcy
{
    private final List a;
    
    public abcw(final abcy... array) {
        this.a = Arrays.asList(array);
    }
    
    public final void b(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abcy)iterator.next()).b(b);
        }
    }
    
    public final void oD(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abcy)iterator.next()).oD(b);
        }
    }
    
    public final void re(final abcx abcx) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abcy)iterator.next()).re(abcx);
        }
    }
}
