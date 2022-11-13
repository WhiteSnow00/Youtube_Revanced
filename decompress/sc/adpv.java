import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class adpv implements afva
{
    final String a;
    final adps b;
    final adpq c;
    final adpw d;
    final long e;
    final boolean f;
    final ListenableFuture g;
    final adpx h;
    
    public adpv(final adpx h, final String a, final adps b, final adpq c, final adpw d, final long e, final boolean f, final ListenableFuture g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final /* bridge */ void b(final Object o) {
        this.h.f(this.a, (adkx)o, this.b, this.c, this.d, this.e, this.f);
    }
    
    public final void rF(final Throwable t) {
        if (this.g.isCancelled()) {
            return;
        }
        if (this.c.a()) {
            admv b;
            try {
                b = this.h.d.b(this.a);
            }
            catch (final adkv adkv) {
                this.h.f.h("Unexeptected missing job while evaluating interruption.", (Throwable)adkv);
                ttr.f("UploadTaskController", "Unexeptected missing job while evaluating interruption.", (Throwable)adkv);
                b = null;
            }
            if (b != null && b.w && !b.x) {
                return;
            }
        }
        this.h.f(this.a, this.b.m(t, this.a, this.h.d, this.f ^ true), this.b, this.c, this.d, this.e, this.f);
    }
}
