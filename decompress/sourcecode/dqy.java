// 
// Decompiled by Procyon v0.6.0
// 

public final class dqy
{
    public long a;
    public int b;
    public int c;
    public long d;
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int b = this.b;
        final int c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder(137);
        sb.append("SubsampleEntry{subsampleSize=");
        sb.append(a);
        sb.append(", subsamplePriority=");
        sb.append(b);
        sb.append(", discardable=");
        sb.append(c);
        sb.append(", reserved=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
