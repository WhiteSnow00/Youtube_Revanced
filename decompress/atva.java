import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atva implements atuo
{
    public final atvf a;
    public final atsj b;
    private final atsm c;
    private final atsm d;
    
    public atva(final atvf a, final Throwable t) {
        this.a = a;
        this.b = auop.h(false);
        this.c = auop.j((Object)t);
        this.d = auop.j((Object)null);
    }
    
    public static final ArrayList i() {
        return new ArrayList(4);
    }
    
    public final Object c() {
        return this.d.a;
    }
    
    public final Throwable d() {
        return (Throwable)this.c.a;
    }
    
    public final void e(final Throwable t) {
        final Throwable d = this.d();
        if (d == null) {
            this.c.c(t);
            return;
        }
        if (t == d) {
            return;
        }
        final Object c = this.c();
        if (c == null) {
            this.f(t);
            return;
        }
        if (c instanceof Throwable) {
            if (t == c) {
                return;
            }
            final ArrayList i = i();
            i.add(c);
            i.add(t);
            this.f(i);
        }
        else {
            if (c instanceof ArrayList) {
                ((ArrayList<Throwable>)c).add(t);
                return;
            }
            new StringBuilder("State is ").append(c);
            throw new IllegalStateException("State is ".concat(c.toString()));
        }
    }
    
    public final void f(final Object o) {
        this.d.c(o);
    }
    
    public final boolean g() {
        return this.d() != null;
    }
    
    public final boolean h() {
        return this.b.a();
    }
    
    @Override
    public final atvf tE() {
        return this.a;
    }
    
    @Override
    public final boolean tH() {
        return this.d() == null;
    }
    
    @Override
    public final String toString() {
        final boolean g = this.g();
        final boolean h = this.h();
        final Throwable d = this.d();
        final Object c = this.c();
        final atvf a = this.a;
        final StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(g);
        sb.append(", completing=");
        sb.append(h);
        sb.append(", rootCause=");
        sb.append(d);
        sb.append(", exceptions=");
        sb.append(c);
        sb.append(", list=");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
