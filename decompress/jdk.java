// 
// Decompiled by Procyon v0.6.0
// 

public final class jdk
{
    public final long a;
    public final long b;
    public final long c;
    public final jcg d;
    
    public jdk(final long a, final long b, final long c, final jcg d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final String string = this.d.toString();
        final StringBuilder sb = new StringBuilder("OverlayRequest{transientOverlay=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
