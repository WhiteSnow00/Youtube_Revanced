import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adnh extends adnf
{
    private final adng b;
    private final Set c;
    
    public adnh(final adnq... array) {
        super(4);
        this.b = new adng(this);
        this.c = afhk.q(array);
    }
    
    protected final void e() {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((adnq)iterator.next()).b((adnp)this.b);
        }
    }
    
    public final boolean equals(final Object o) {
        return o instanceof adnh && this.c.equals(((adnh)o).c);
    }
    
    protected final void f() {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((adnq)iterator.next()).d((adnp)this.b);
        }
    }
    
    public final adnr g() {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            final adnr g = ((adnq)iterator.next()).g();
            if (!g.b) {
                return g;
            }
        }
        return adnr.a;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { super.a, this.c });
    }
}
