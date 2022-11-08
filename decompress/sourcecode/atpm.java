// 
// Decompiled by Procyon v0.6.0
// 

public class atpm
{
    public final Throwable b;
    public final ator c;
    
    public atpm(final Throwable b, final boolean b2) {
        this.b = b;
        this.c = auet.f(b2);
    }
    
    public final boolean a() {
        return this.c.b();
    }
    
    @Override
    public final String toString() {
        final String a = atqc.a(this);
        final Throwable b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("[");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
