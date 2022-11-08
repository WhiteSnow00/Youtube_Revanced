// 
// Decompiled by Procyon v0.6.0
// 

final class dgk implements dgp
{
    int a;
    public Class b;
    private final dgl c;
    
    public dgk(final dgl c) {
        this.c = c;
    }
    
    public final void a() {
        this.c.c((dgp)this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dgk) {
            final dgk dgk = (dgk)o;
            if (this.a == dgk.a && this.b == dgk.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final Class b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return a * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("Key{size=");
        sb.append(a);
        sb.append("array=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
