// 
// Decompiled by Procyon v0.6.0
// 

public abstract class itu
{
    protected boolean a;
    
    private final void e(final boolean b, final boolean a) {
        this.a = a;
        if (this.h(a)) {
            this.d(b);
            return;
        }
        this.a(b);
    }
    
    protected abstract void a(final boolean p0);
    
    public final void b(final boolean b) {
        this.e(b, false);
    }
    
    public final void c(final boolean b) {
        this.e(b, true);
    }
    
    protected abstract void d(final boolean p0);
    
    public final void f() {
        this.g(true);
    }
    
    protected final void g(final boolean b) {
        if (this.a) {
            this.c(b);
            return;
        }
        this.b(b);
    }
    
    protected abstract boolean h(final boolean p0);
}
