import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

final class dgr implements dgp
{
    int a;
    public Bitmap$Config b;
    private final dgs c;
    
    public dgr(final dgs c) {
        this.c = c;
    }
    
    public final void a() {
        this.c.c((dgp)this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dgr) {
            final dgr dgr = (dgr)o;
            if (this.a == dgr.a && dpg.n((Object)this.b, (Object)dgr.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final Bitmap$Config b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return a * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return dgt.a(this.a, this.b);
    }
}
