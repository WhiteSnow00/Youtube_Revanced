// 
// Decompiled by Procyon v0.6.0
// 

public final class asjd implements asjm
{
    public final arwu a;
    public final boolean b;
    public int c;
    public boolean d;
    private boolean e;
    private boolean f;
    
    public asjd() {
    }
    
    public asjd(final arwu a, final boolean b) {
        this.c = 1;
        this.d = true;
        this.e = false;
        this.f = false;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.a.c();
        this.f = true;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b("Cancelled by client with StreamObserver.onError()", t);
        this.e = true;
    }
    
    @Override
    public final void c(final Object o) {
        adme.U(this.e ^ true, "Stream was terminated by error, no further calls are allowed");
        adme.U(this.f ^ true, "Stream is already completed, no further calls are allowed");
        this.a.g(o);
    }
    
    public final void d() {
        if (!this.b) {
            this.a.f(2);
            return;
        }
        this.a.f(1);
    }
}
