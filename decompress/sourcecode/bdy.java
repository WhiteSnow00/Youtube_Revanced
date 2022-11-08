import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdy
{
    public final String a;
    public final ayf b;
    public final ayf c;
    public final int d;
    public final int e;
    
    public bdy(final String a, final ayf b, final ayf c, final int d, final int n) {
        boolean b2 = true;
        int e = n;
        if (d != 0) {
            if (n == 0) {
                e = 0;
                b2 = b2;
            }
            else {
                b2 = false;
                e = n;
            }
        }
        dk.f(b2);
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.a = a;
            dk.d((Object)b);
            this.b = b;
            dk.d((Object)c);
            this.c = c;
            this.d = d;
            this.e = e;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bdy bdy = (bdy)o;
                if (this.d == bdy.d && this.e == bdy.e && this.a.equals(bdy.a) && this.b.equals((Object)bdy.b) && this.c.equals((Object)bdy.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.d + 527) * 31 + this.e) * 31 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
}
