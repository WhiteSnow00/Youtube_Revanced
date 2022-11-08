// 
// Decompiled by Procyon v0.6.0
// 

public final class arez
{
    final int a;
    final short b;
    
    public arez(final int a, final short n) {
        this.a = a;
        this.b = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arez arez = (arez)o;
            return this.a == arez.a && this.b == arez.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final short b = this.b;
        final StringBuilder sb = new StringBuilder(54);
        sb.append("{availableBitrate=");
        sb.append(a);
        sb.append(", targetRateShare=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
