// 
// Decompiled by Procyon v0.6.0
// 

public abstract class augl implements augh
{
    protected augl() {
    }
    
    public final int a(final aufx aufx) {
        final int a = this.e().a(aufx);
        if (a == -1) {
            return 0;
        }
        return this.b(a);
    }
    
    public final int c() {
        return this.e().b();
    }
    
    public final aufx d(final int n) {
        return this.e().b[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof augh)) {
            return false;
        }
        final augh augh = (augh)o;
        if (this.c() != augh.c()) {
            return false;
        }
        for (int c = this.c(), i = 0; i < c; ++i) {
            if (this.b(i) != augh.b(i) || this.d(i) != augh.d(i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c();
        int i = 0;
        int n = 17;
        while (i < c) {
            n = (n * 27 + this.b(i)) * 27 + this.d(i).hashCode();
            ++i;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        return atoc.f().a((augh)this);
    }
}
