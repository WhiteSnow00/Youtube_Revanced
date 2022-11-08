import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjs extends adjq
{
    private final adjr b;
    private final Set c;
    
    public adjs(final adkb... array) {
        super(4);
        this.b = new adjr(this);
        this.c = (Set)afdu.q((Object[])array);
    }
    
    protected final void e() {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((adkb)iterator.next()).b((adka)this.b);
        }
    }
    
    public final boolean equals(final Object o) {
        return o instanceof adjs && this.c.equals(((adjs)o).c);
    }
    
    protected final void f() {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((adkb)iterator.next()).d((adka)this.b);
        }
    }
    
    public final adkc g() {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            final adkc g = ((adkb)iterator.next()).g();
            if (!g.b) {
                return g;
            }
        }
        return adkc.a;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { super.a, this.c });
    }
}
