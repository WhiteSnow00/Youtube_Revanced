// 
// Decompiled by Procyon v0.6.0
// 

public final class acce
{
    public static final acce a;
    public final boolean b;
    
    static {
        a = a().a();
    }
    
    public acce() {
    }
    
    public acce(final boolean b) {
        this.b = b;
    }
    
    public static accd a() {
        final accd accd = new accd();
        accd.b(false);
        return accd;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof acce && this.b == ((acce)o).b);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return n ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder("LocalElementsFlag{swipeToCameraEnabled=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
