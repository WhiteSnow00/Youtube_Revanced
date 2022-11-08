// 
// Decompiled by Procyon v0.6.0
// 

public final class aekv
{
    public final Class a;
    public final cme b;
    public final aexq c;
    public final aekt d;
    public final cmh e;
    public final aexq f;
    public final aexq g;
    public final afdu h;
    public final aexq i;
    public final aexq j;
    
    public aekv() {
    }
    
    public aekv(final Class a, final cme b, final aexq c, final aekt d, final cmh e, final aexq f, final aexq g, final afdu h, final aexq i, final aexq j) {
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
        if (o instanceof aekv) {
            final aekv aekv = (aekv)o;
            if (this.a.equals(aekv.a) && this.b.equals((Object)aekv.b) && this.c.equals(aekv.c) && this.d.equals(aekv.d) && this.e.equals((Object)aekv.e) && this.f.equals(aekv.f) && this.g.equals(aekv.g) && this.h.equals((Object)aekv.h) && this.i.equals(aekv.i) && this.j.equals(aekv.j)) {
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
