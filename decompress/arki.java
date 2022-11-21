// 
// Decompiled by Procyon v0.6.0
// 

public final class arki
{
    final int a;
    final short b;
    
    public arki(final int a, final short b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arki arki = (arki)o;
            return this.a == arki.a && this.b == arki.b;
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
