// 
// Decompiled by Procyon v0.6.0
// 

public class atte
{
    public final Throwable b;
    public final atsj c;
    
    public atte(final Throwable t) {
        this(t, false);
    }
    
    public atte(final Throwable b, final boolean b2) {
        this.b = b;
        this.c = auop.h(b2);
    }
    
    public final boolean a() {
        return this.c.b();
    }
    
    @Override
    public final String toString() {
        final String a = attu.a(this);
        final Throwable b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("[");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
