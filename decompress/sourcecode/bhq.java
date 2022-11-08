// 
// Decompiled by Procyon v0.6.0
// 

final class bhq implements bhg
{
    final /* synthetic */ bhr a;
    
    public bhq(final bhr a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Exception ex) {
        bao.b("DecoderAudioRenderer", "Audio sink error", (Throwable)ex);
        this.a.f.m(ex);
    }
    
    @Override
    public final void d(final long n) {
        this.a.f.s(n);
    }
    
    @Override
    public final void e() {
        this.a.e = true;
    }
    
    @Override
    public final void f(final boolean b) {
        this.a.f.t(b);
    }
    
    @Override
    public final void g(final int n, final long n2, final long n3) {
        this.a.f.u(n, n2, n3);
    }
}
