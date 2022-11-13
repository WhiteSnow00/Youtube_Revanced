// 
// Decompiled by Procyon v0.6.0
// 

public final class dfx implements dfy, dpm
{
    private static final akr a;
    private dfy b;
    private boolean c;
    private boolean d;
    private final adpq e;
    
    static {
        a = dpo.b(20, (dpk)new dhe(1));
    }
    
    public dfx() {
        this.e = adpq.c();
    }
    
    static dfx d(final dfy b) {
        final dfx dfx = (dfx)dfx.a.a();
        clm.h((Object)dfx);
        dfx.d = false;
        dfx.c = true;
        dfx.b = b;
        return dfx;
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
                dfx.a.b((Object)this);
            }
        }
    }
    
    public final adpq f() {
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
