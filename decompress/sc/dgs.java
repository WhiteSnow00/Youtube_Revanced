import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

final class dgs implements dgq
{
    int a;
    public Bitmap$Config b;
    private final dgt c;
    
    public dgs(final dgt c) {
        this.c = c;
    }
    
    public final void a() {
        this.c.c((dgq)this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dgs) {
            final dgs dgs = (dgs)o;
            if (this.a == dgs.a && dph.m((Object)this.b, (Object)dgs.b)) {
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
        return dgu.a(this.a, this.b);
    }
}
