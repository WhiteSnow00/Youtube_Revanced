// 
// Decompiled by Procyon v0.6.0
// 

public final class bua
{
    public static final bua a;
    public final long b;
    public final long c;
    
    static {
        a = new bua(0L, 0L);
    }
    
    public bua(final long b, final long c) {
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
                final bua bua = (bua)o;
                if (this.b == bua.b && this.c == bua.c) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (int)this.b * 31 + (int)this.c;
    }
    
    @Override
    public final String toString() {
        final long b = this.b;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(b);
        sb.append(", position=");
        sb.append(c);
        sb.append("]");
        return sb.toString();
    }
}
