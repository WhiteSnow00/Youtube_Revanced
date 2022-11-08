import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bga
{
    public final long a;
    public final azl b;
    public final int c;
    public final long d;
    public final azl e;
    public final int f;
    public final long g;
    public final long h;
    public final ayx i;
    public final ayx j;
    
    public bga(final long a, final azl b, final int c, final ayx i, final long d, final azl e, final int f, final ayx j, final long g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = i;
        this.d = d;
        this.e = e;
        this.f = f;
        this.j = j;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bga bga = (bga)o;
                if (this.a == bga.a && this.c == bga.c && this.d == bga.d && this.f == bga.f && this.g == bga.g && this.h == bga.h && aeda.v((Object)this.b, (Object)bga.b) && aeda.v((Object)this.i, (Object)bga.i) && aeda.v((Object)this.e, (Object)bga.e) && aeda.v((Object)this.j, (Object)bga.j)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.i, this.d, this.e, this.f, this.j, this.g, this.h });
    }
}
