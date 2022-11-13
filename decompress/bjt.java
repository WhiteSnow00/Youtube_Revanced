// 
// Decompiled by Procyon v0.6.0
// 

public final class bjt
{
    final long a;
    final long b;
    
    public bjt(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bjt bjt = (bjt)o;
                if (this.a == bjt.a && this.b == bjt.b) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
}
