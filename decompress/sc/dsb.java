// 
// Decompiled by Procyon v0.6.0
// 

public final class dsb
{
    int a;
    int b;
    int c;
    int d;
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final dsb dsb = (dsb)o;
            return this.c == dsb.c && this.b == dsb.b && this.d == dsb.d && this.a == dsb.a;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
}
