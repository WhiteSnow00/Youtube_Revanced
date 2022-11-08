// 
// Decompiled by Procyon v0.6.0
// 

public final class mzs
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    
    public mzs() {
    }
    
    public mzs(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final Integer h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mzs) {
            final mzs mzs = (mzs)o;
            if (this.a.equals(mzs.a) && this.b.equals(mzs.b) && this.c.equals(mzs.c) && this.d.equals(mzs.d) && this.e.equals(mzs.e) && this.f.equals(mzs.f) && this.g.equals(mzs.g) && this.h.equals(mzs.h)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final Integer h = this.h;
        final StringBuilder sb = new StringBuilder("BuildInfo{fingerprint=");
        sb.append(a);
        sb.append(", brand=");
        sb.append(b);
        sb.append(", product=");
        sb.append(c);
        sb.append(", device=");
        sb.append(d);
        sb.append(", model=");
        sb.append(e);
        sb.append(", manufacturer=");
        sb.append(f);
        sb.append(", baseOs=");
        sb.append(g);
        sb.append(", sdkInt=");
        sb.append(h);
        sb.append("}");
        return sb.toString();
    }
}
