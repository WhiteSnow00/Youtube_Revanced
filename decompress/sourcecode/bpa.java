import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpa extends bmr
{
    public static final ayf a;
    public static final byte[] b;
    private static final ayt c;
    private final long d;
    private final ayt e;
    
    static {
        final aye aye = new aye();
        aye.k = "audio/raw";
        aye.x = 2;
        aye.y = 44100;
        aye.z = 2;
        final ayf ayf = a = aye.a();
        final ayi ayi = new ayi();
        ayi.c("SilenceMediaSource");
        ayi.a = Uri.EMPTY;
        ayi.b = ayf.n;
        c = ayi.a();
        b = new byte[baw.m(2, 2) * 1024];
    }
    
    public bpa(final long d) {
        final ayt c = bpa.c;
        dk.f(d >= 0L);
        this.d = d;
        this.e = c;
    }
    
    public static long b(final long n) {
        return baw.m(2, 2) * (n * 44100L / 1000000L);
    }
    
    public final ayt sJ() {
        return this.e;
    }
    
    public final void sK() {
    }
    
    protected final void sL(final bcn bcn) {
        this.y((azl)new bpb(this.d, true, false, false, this.e));
    }
    
    public final void sM(final bnu bnu) {
    }
    
    protected final void sN() {
    }
    
    public final bnu sO(final ayx ayx, final bre bre, final long n) {
        return (bnu)new boy(this.d);
    }
}
