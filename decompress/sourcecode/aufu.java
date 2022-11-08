// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aufu implements aufq
{
    protected aufu() {
    }
    
    public final int a(final aufg aufg) {
        final int a = this.e().a(aufg);
        if (a == -1) {
            return 0;
        }
        return this.b(a);
    }
    
    public final int c() {
        return this.e().b();
    }
    
    public final aufg d(final int n) {
        return this.e().b[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aufq)) {
            return false;
        }
        final aufq aufq = (aufq)o;
        if (this.c() != aufq.c()) {
            return false;
        }
        for (int c = this.c(), i = 0; i < c; ++i) {
            if (this.b(i) != aufq.b(i) || this.d(i) != aufq.d(i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c();
        int n = 17;
        for (int i = 0; i < c; ++i) {
            n = (n * 27 + this.b(i)) * 27 + this.d(i).hashCode();
        }
        return n;
    }
    
    @Override
    public final String toString() {
        return aujh.c().a((aufq)this);
    }
}
