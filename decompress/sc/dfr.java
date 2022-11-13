import java.security.MessageDigest;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfr implements ddk
{
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final ddk g;
    private final Map h;
    private final ddp i;
    private int j;
    
    public dfr(final Object b, final ddk g, final int c, final int d, final Map h, final Class e, final Class f, final ddp i) {
        clm.h(b);
        this.b = b;
        clm.l((Object)g, "Signature must not be null");
        this.g = g;
        this.c = c;
        this.d = d;
        clm.h((Object)h);
        this.h = h;
        clm.l((Object)e, "Resource class must not be null");
        this.e = e;
        this.f = f;
        clm.h((Object)i);
        this.i = i;
    }
    
    public final void a(final MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dfr) {
            final dfr dfr = (dfr)o;
            if (this.b.equals(dfr.b) && this.g.equals(dfr.g) && this.d == dfr.d && this.c == dfr.c && this.h.equals(dfr.h) && this.e.equals(dfr.e) && this.f.equals(dfr.f) && this.i.equals(dfr.i)) {
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
