import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class adrk implements afwr
{
    final String a;
    final adrh b;
    final adrf c;
    final adrl d;
    final long e;
    final boolean f;
    final ListenableFuture g;
    final adrm h;
    
    public adrk(final adrm h, final String a, final adrh b, final adrf c, final adrl d, final long e, final boolean f, final ListenableFuture g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final /* bridge */ void b(final Object o) {
        this.h.f(this.a, (admm)o, this.b, this.c, this.d, this.e, this.f);
    }
    
    @Override
    public final void rF(final Throwable t) {
        if (this.g.isCancelled()) {
            return;
        }
        if (this.c.a()) {
            adoj b;
            try {
                b = this.h.d.b(this.a);
            }
            catch (final admk admk) {
                this.h.f.D("Unexeptected missing job while evaluating interruption.", (Throwable)admk);
                tut.f("UploadTaskController", "Unexeptected missing job while evaluating interruption.", (Throwable)admk);
                b = null;
            }
            if (b != null && b.w && !b.x) {
                return;
            }
        }
        this.h.f(this.a, this.b.m(t, this.a, this.h.d, this.f ^ true), this.b, this.c, this.d, this.e, this.f);
    }
}
