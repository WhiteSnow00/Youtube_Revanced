// 
// Decompiled by Procyon v0.6.0
// 

public final class dfw implements dfx, dpl
{
    private static final akq a;
    private dfx b;
    private boolean c;
    private boolean d;
    private final adnp e;
    
    static {
        a = dpn.b(20, (dpj)new dhd(1));
    }
    
    public dfw() {
        this.e = adnp.c();
    }
    
    static dfw d(final dfx b) {
        final dfw dfw = (dfw)dfw.a.a();
        cll.h((Object)dfw);
        dfw.d = false;
        dfw.c = true;
        dfw.b = b;
        return dfw;
    }
    
    public final int a() {
        return this.b.a();
    }
    
    public final Class b() {
        return this.b.b();
    }
    
    public final Object c() {
        return this.b.c();
    }
    
    public final void e() {
        synchronized (this) {
            this.e.b();
            this.d = true;
            if (!this.c) {
                this.b.e();
                this.b = null;
                dfw.a.b((Object)this);
            }
        }
    }
    
    public final adnp f() {
        return this.e;
    }
    
    final void g() {
        synchronized (this) {
            this.e.b();
            if (!this.c) {
                throw new IllegalStateException("Already unlocked");
            }
            this.c = false;
            if (this.d) {
                this.e();
            }
        }
    }
}
