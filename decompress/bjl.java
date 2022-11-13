// 
// Decompiled by Procyon v0.6.0
// 

public final class bjl
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    
    public bjl(final String a, final String b, final String c, final String d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bjl)) {
            return false;
        }
        final bjl bjl = (bjl)o;
        return bax.aa((Object)this.a, (Object)bjl.a) && bax.aa((Object)this.b, (Object)bjl.b) && bax.aa((Object)this.c, (Object)bjl.c) && bax.aa((Object)this.d, (Object)bjl.d) && bax.aa((Object)this.e, (Object)bjl.e);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final String d = this.d;
        int hashCode5;
        if (d != null) {
            hashCode5 = d.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final String e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return ((((hashCode2 + 527) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
}
