// 
// Decompiled by Procyon v0.6.0
// 

final class dgl implements dgq
{
    int a;
    public Class b;
    private final dgm c;
    
    public dgl(final dgm c) {
        this.c = c;
    }
    
    public final void a() {
        this.c.c((dgq)this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dgl) {
            final dgl dgl = (dgl)o;
            if (this.a == dgl.a && this.b == dgl.b) {
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
