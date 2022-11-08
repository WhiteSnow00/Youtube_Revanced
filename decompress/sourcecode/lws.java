import java.io.File;
import java.util.TreeSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lws
{
    public final int a;
    public final String b;
    public final TreeSet c;
    public lww d;
    public boolean e;
    
    public lws(final int a, final String b, final lww d) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = new TreeSet();
    }
    
    public final lxf a(final long n) {
        final lxf lxf = new lxf(this.b, n, -1L, -9223372036854775807L, (File)null);
        final lxf lxf2 = this.c.floor(lxf);
        if (lxf2 != null && lxf2.b + lxf2.c > n) {
            return lxf2;
        }
        final lxf lxf3 = this.c.ceiling(lxf);
        lxf d;
        if (lxf3 == null) {
            d = lxf.d(this.b, n);
        }
        else {
            d = new lxf(this.b, n, lxf3.b - n, -9223372036854775807L, (File)null);
        }
        return d;
    }
    
    public final boolean b() {
        return this.c.isEmpty();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final lws lws = (lws)o;
                if (this.a == lws.a && this.b.equals(lws.b) && this.c.equals(lws.c) && this.d.equals((Object)lws.d)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a * 31 + this.b.hashCode()) * 31 + this.d.hashCode();
    }
}
