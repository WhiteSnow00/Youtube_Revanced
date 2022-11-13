// 
// Decompiled by Procyon v0.6.0
// 

public final class aemw
{
    public final Class a;
    public final cmf b;
    public final aezp c;
    public final aemu d;
    public final cmi e;
    public final aezp f;
    public final aezp g;
    public final afft h;
    public final aezp i;
    public final aezp j;
    
    public aemw() {
    }
    
    public aemw(final Class a, final cmf b, final aezp c, final aemu d, final cmi e, final aezp f, final aezp g, final afft h, final aezp i, final aezp j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aemw) {
            final aemw aemw = (aemw)o;
            if (this.a.equals(aemw.a) && this.b.equals((Object)aemw.b) && this.c.equals((Object)aemw.c) && this.d.equals(aemw.d) && this.e.equals((Object)aemw.e) && this.f.equals((Object)aemw.f) && this.g.equals((Object)aemw.g) && this.h.equals((Object)aemw.h) && this.i.equals((Object)aemw.i) && this.j.equals((Object)aemw.j)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ 0x79A31AAC) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ 0x79A31AAC) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final String value7 = String.valueOf(this.g);
        final String value8 = String.valueOf(this.h);
        final String value9 = String.valueOf(this.i);
        final String value10 = String.valueOf(this.j);
        final StringBuilder sb = new StringBuilder("TikTokWorkSpec{workerClass=");
        sb.append(value);
        sb.append(", constraints=");
        sb.append(value2);
        sb.append(", expedited=");
        sb.append(value3);
        sb.append(", initialDelay=");
        sb.append(value4);
        sb.append(", inputData=");
        sb.append(value5);
        sb.append(", periodic=");
        sb.append(value6);
        sb.append(", unique=");
        sb.append(value7);
        sb.append(", tags=");
        sb.append(value8);
        sb.append(", backoffPolicy=");
        sb.append(value9);
        sb.append(", backoffDelayDuration=");
        sb.append(value10);
        sb.append("}");
        return sb.toString();
    }
}
