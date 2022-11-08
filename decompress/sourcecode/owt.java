import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owt
{
    public final aexq a;
    private final aexq b;
    
    public owt(final int n) {
        this.b = (aexq)aewp.a;
        this.a = aexq.k(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof owt) {
            final owt owt = (owt)o;
            if (this.b.equals(owt.b) && this.a.equals(owt.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.a });
    }
    
    @Override
    public final String toString() {
        return ((Integer)((aexw)this.a).a).toString();
    }
}
