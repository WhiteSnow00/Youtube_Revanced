import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpb extends bms
{
    public static final ayg a;
    public static final byte[] b;
    private static final ayu c;
    private final long d;
    private final ayu e;
    
    static {
        final ayf ayf = new ayf();
        ayf.k = "audio/raw";
        ayf.x = 2;
        ayf.y = 44100;
        ayf.z = 2;
        final ayg ayg = a = ayf.a();
        final ayj ayj = new ayj();
        ayj.c("SilenceMediaSource");
        ayj.a = Uri.EMPTY;
        ayj.b = ayg.n;
        c = ayj.a();
        b = new byte[bax.m(2, 2) * 1024];
    }
    
    public bpb(final long d) {
        final ayu c = bpb.c;
        dk.f(d >= 0L);
        this.d = d;
        this.e = c;
    }
    
    public static long b(final long n) {
        return bax.m(2, 2) * (n * 44100L / 1000000L);
    }
    
    public final ayu sP() {
        return this.e;
    }
    
    public final void sQ() {
    }
    
    protected final void sR(final bco bco) {
        this.y((azm)new bpc(this.d, true, false, false, this.e));
    }
    
    public final void sS(final bnv bnv) {
    }
    
    protected final void sT() {
    }
    
    public final bnv sU(final ayy ayy, final brf brf, final long n) {
        return (bnv)new boz(this.d);
    }
}
