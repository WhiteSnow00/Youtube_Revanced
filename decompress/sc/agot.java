// 
// Decompiled by Procyon v0.6.0
// 

public final class agot
{
    private final agou a;
    
    public agot(final double n, final double n2, final double n3) {
        this.a = new agou(agor.b(n), agor.b(n2), agor.b(n3), agor.b(1.0));
    }
    
    public final double a() {
        return this.a.c;
    }
    
    public final double b() {
        return this.a.b;
    }
    
    public final double c() {
        return this.a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof agot && this.a.equals(((agot)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final double c = this.c();
        final double b = this.b();
        final double a = this.a();
        final double d = this.a.d;
        final StringBuilder sb = new StringBuilder("RgbColor(r=");
        sb.append(c);
        sb.append(", g=");
        sb.append(b);
        sb.append(", b=");
        sb.append(a);
        sb.append(", alpha=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
