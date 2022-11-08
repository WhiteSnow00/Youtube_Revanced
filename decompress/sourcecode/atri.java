import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atri implements atqw
{
    public final atrn a;
    public final ator b;
    private final atou c;
    private final atou d;
    
    public atri(final atrn a, final Throwable t) {
        this.a = a;
        this.b = auet.f(false);
        this.c = auet.h(t);
        this.d = auet.h(null);
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
            this.c.c((Object)t);
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
    
    public final atrn tC() {
        return this.a;
    }
    
    public final boolean tF() {
        return this.d() == null;
    }
    
    @Override
    public final String toString() {
        final boolean g = this.g();
        final boolean h = this.h();
        final Throwable d = this.d();
        final Object c = this.c();
        final atrn a = this.a;
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
