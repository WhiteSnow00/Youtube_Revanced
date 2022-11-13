// 
// Decompiled by Procyon v0.6.0
// 

final class bon
{
    public final int a;
    public final boolean b;
    
    public bon(final int a, final boolean b) {
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
                final bon bon = (bon)o;
                if (this.a == bon.a && this.b == bon.b) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + (this.b ? 1 : 0);
    }
}
