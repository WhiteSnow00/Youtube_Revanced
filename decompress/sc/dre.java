// 
// Decompiled by Procyon v0.6.0
// 

public final class dre
{
    public long a;
    public final long b;
    
    public dre(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder(61);
        sb.append("Entry{count=");
        sb.append(a);
        sb.append(", delta=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
