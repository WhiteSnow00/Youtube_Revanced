import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbv implements Iterator
{
    final /* synthetic */ ahbx a;
    private int b;
    private boolean c;
    private Iterator d;
    
    public ahbv(final ahbx a) {
        this.a = a;
        this.b = -1;
    }
    
    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.b.entrySet().iterator();
        }
        return this.d;
    }
    
    @Override
    public final boolean hasNext() {
        final int b = this.b;
        boolean b2 = true;
        if (b + 1 >= this.a.a.size()) {
            if (!this.a.b.isEmpty()) {
                if (!this.a().hasNext()) {
                    return false;
                }
                b2 = b2;
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
    
    @Override
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        this.a.g();
        if (this.b < this.a.a.size()) {
            this.a.e(this.b--);
            return;
        }
        this.a().remove();
    }
}
