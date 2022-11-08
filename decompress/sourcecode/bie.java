// 
// Decompiled by Procyon v0.6.0
// 

final class bie implements bhg
{
    final /* synthetic */ bif a;
    
    public bie(final bif a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Exception ex) {
        bao.b("MediaCodecAudioRenderer", "Audio sink error", (Throwable)ex);
        this.a.e.m(ex);
    }
    
    @Override
    public final void b() {
        final qpt f = this.a.f;
        if (f != null) {
            ((bez)f.a).a.d(2);
        }
    }
    
    @Override
    public final void c() {
        final qpt f = this.a.f;
        if (f != null) {
            ((bez)f.a).d = true;
        }
    }
    
    @Override
    public final void d(final long n) {
        this.a.e.s(n);
    }
    
    @Override
    public final void e() {
        this.a.d = true;
    }
    
    @Override
    public final void f(final boolean b) {
        this.a.e.t(b);
    }
    
    @Override
    public final void g(final int n, final long n2, final long n3) {
        this.a.e.u(n, n2, n3);
    }
}
