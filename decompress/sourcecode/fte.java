// 
// Decompiled by Procyon v0.6.0
// 

public final class fte
{
    public final acib a;
    public achk b;
    public achk c;
    private final achk d;
    private Object e;
    
    public fte() {
        final acib a = new acib();
        this.a = a;
        final acjb d = new acjb();
        this.d = (achk)d;
        this.b = (achk)new acjb();
        this.c = (achk)new acjb();
        a.m((achk)d);
        a.m(this.c);
        a.m(this.b);
    }
    
    public final int a(final int n) {
        return n + ((tdv)this.d).size();
    }
    
    public final void b(final achk achk) {
        if (this.c == achk) {
            return;
        }
        Object c;
        if ((c = achk) == null) {
            c = new acjb();
        }
        this.a.r(this.c, (achk)c);
        this.c = (achk)c;
    }
    
    public final void c(final Object e) {
        if (e == this.e) {
            return;
        }
        this.e = e;
        final acjb b = new acjb();
        if (e != null) {
            ((tdv)b).add(0, e);
        }
        this.a.r(this.b, (achk)b);
        this.b = (achk)b;
    }
}
