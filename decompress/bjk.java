// 
// Decompiled by Procyon v0.6.0
// 

public final class bjk
{
    public final String a;
    public final String b;
    public final String c;
    
    public bjk(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bjk bjk = (bjk)o;
                if (bax.aa((Object)this.a, (Object)bjk.a) && bax.aa((Object)this.b, (Object)bjk.b) && bax.aa((Object)this.c, (Object)bjk.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
}
