// 
// Decompiled by Procyon v0.6.0
// 

public final class arfd
{
    public long a;
    public final int b;
    
    public arfd(final long a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arfd arfd = (arfd)o;
            return this.b == arfd.b && this.a == arfd.a;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(74);
        sb.append("Entry{sampleCount=");
        sb.append(a);
        sb.append(", groupDescriptionIndex=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
