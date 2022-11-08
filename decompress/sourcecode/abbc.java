import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbc implements abbe
{
    private final List a;
    
    public abbc(final abbe... array) {
        this.a = Arrays.asList(array);
    }
    
    public final void b(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbe)iterator.next()).b(b);
        }
    }
    
    public final void oD(final boolean b) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbe)iterator.next()).oD(b);
        }
    }
    
    public final void qY(final abbd abbd) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((abbe)iterator.next()).qY(abbd);
        }
    }
}
