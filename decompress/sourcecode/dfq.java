import java.security.MessageDigest;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfq implements ddj
{
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final ddj g;
    private final Map h;
    private final ddo i;
    private int j;
    
    public dfq(final Object b, final ddj g, final int c, final int d, final Map h, final Class e, final Class f, final ddo i) {
        cll.h(b);
        this.b = b;
        cll.l((Object)g, "Signature must not be null");
        this.g = g;
        this.c = c;
        this.d = d;
        cll.h((Object)h);
        this.h = h;
        cll.l((Object)e, "Resource class must not be null");
        this.e = e;
        this.f = f;
        cll.h((Object)i);
        this.i = i;
    }
    
    public final void a(final MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dfq) {
            final dfq dfq = (dfq)o;
            if (this.b.equals(dfq.b) && this.g.equals(dfq.g) && this.d == dfq.d && this.c == dfq.c && this.h.equals(dfq.h) && this.e.equals(dfq.e) && this.f.equals(dfq.f) && this.i.equals((Object)dfq.i)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int j;
        if ((j = this.j) == 0) {
            final int hashCode = this.b.hashCode();
            this.j = hashCode;
            final int i = ((hashCode * 31 + this.g.hashCode()) * 31 + this.c) * 31 + this.d;
            this.j = i;
            final int k = i * 31 + this.h.hashCode();
            this.j = k;
            final int l = k * 31 + this.e.hashCode();
            this.j = l;
            final int m = l * 31 + this.f.hashCode();
            this.j = m;
            j = m * 31 + this.i.hashCode();
            this.j = j;
        }
        return j;
    }
    
    @Override
    public final String toString() {
        final String string = this.b.toString();
        final int c = this.c;
        final int d = this.d;
        final String string2 = this.e.toString();
        final String string3 = this.f.toString();
        final String string4 = this.g.toString();
        final int j = this.j;
        final String string5 = this.h.toString();
        final String string6 = this.i.toString();
        final StringBuilder sb = new StringBuilder("EngineKey{model=");
        sb.append(string);
        sb.append(", width=");
        sb.append(c);
        sb.append(", height=");
        sb.append(d);
        sb.append(", resourceClass=");
        sb.append(string2);
        sb.append(", transcodeClass=");
        sb.append(string3);
        sb.append(", signature=");
        sb.append(string4);
        sb.append(", hashCode=");
        sb.append(j);
        sb.append(", transformations=");
        sb.append(string5);
        sb.append(", options=");
        sb.append(string6);
        sb.append("}");
        return sb.toString();
    }
}
