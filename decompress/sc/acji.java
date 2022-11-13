// 
// Decompiled by Procyon v0.6.0
// 

public final class acji extends acjg
{
    public final acjn a;
    public int b;
    
    public acji(final acjn a) {
        a.getClass();
        this.a = a;
        this.b = Integer.MAX_VALUE;
        a.qP((acjm)new jkh(this, 4));
    }
    
    public final int a() {
        return Math.min(this.b, ((tfz)this.a).size());
    }
    
    public final long b(final int n) {
        if (n >= 0 && n < this.a()) {
            return n;
        }
        return 0L;
    }
    
    public final Object c(final int n) {
        if (n >= 0 && n < this.a()) {
            return ((tfz)this.a).get(n);
        }
        return null;
    }
    
    public final boolean contains(final Object o) {
        throw null;
    }
    
    public final void h(final int b) {
        tbi.f();
        if (this.b != b) {
            final int size = ((tfz)this.a).size();
            final int min = Math.min(this.b, size);
            final int min2 = Math.min(b, size);
            this.b = b;
            if (min != min2) {
                if (min2 > min) {
                    this.x(min, min2 - min);
                    return;
                }
                this.y(min2, min - min2);
            }
        }
    }
    
    public final boolean isEmpty() {
        return this.a() == 0;
    }
}
