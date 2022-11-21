// 
// Decompiled by Procyon v0.6.0
// 

final class atc
{
    public final long a;
    public final long b;
    
    public atc(final long a, final long b) {
        if (b == 0L) {
            this.a = 0L;
            this.b = 1L;
            return;
        }
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("/");
        sb.append(this.b);
        return sb.toString();
    }
}
