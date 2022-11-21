// 
// Decompiled by Procyon v0.6.0
// 

public final class afji
{
    public final Object a;
    int b;
    final afjp c;
    
    public afji() {
    }
    
    public afji(final afjp c, final int b) {
        this.c = c;
        this.a = c.a[b];
        this.b = b;
    }
    
    public final int a() {
        final int b = this.b;
        Label_0054: {
            if (b != -1) {
                final afjp c = this.c;
                if (b < c.c && aexq.c(this.a, c.a[b])) {
                    break Label_0054;
                }
            }
            this.b = this.c.d(this.a);
        }
        final int b2 = this.b;
        if (b2 == -1) {
            return 0;
        }
        return this.c.b[b2];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof afji) {
            final afji afji = (afji)o;
            if (this.a() == afji.a() && aexq.c(this.a, afji.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode ^ this.a();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int a = this.a();
        if (a == 1) {
            return value;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" x ");
        sb.append(a);
        return sb.toString();
    }
}
