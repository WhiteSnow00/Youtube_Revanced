// 
// Decompiled by Procyon v0.6.0
// 

final class boq
{
    public final int a;
    public final boolean b;
    
    public boq(final int a, final boolean b) {
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
                final boq boq = (boq)o;
                if (this.a == boq.a && this.b == boq.b) {
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
