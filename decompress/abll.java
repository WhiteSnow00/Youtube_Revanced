// 
// Decompiled by Procyon v0.6.0
// 

public enum abll
{
    a("NEW", 0), 
    b("PLAYBACK_PENDING", 1), 
    c("PLAYBACK_LOADED", 2), 
    d("PLAYBACK_INTERRUPTED", 3), 
    e("INTERSTITIAL_REQUESTED", 4), 
    f("INTERSTITIAL_PLAYING", 5), 
    g("READY", 6), 
    h("VIDEO_REQUESTED", 7), 
    i("VIDEO_PLAYING", 8), 
    j("ENDED", 9);
    
    private static final abll[] k;
    
    private abll(final String s, final int n) {
    }
    
    public final boolean a(final abll... array) {
        for (int i = 0; i < array.length; ++i) {
            if (this == array[i]) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean b() {
        return this.a(abll.e, abll.h, abll.b);
    }
    
    public final boolean c(final abll abll) {
        return this.ordinal() >= abll.ordinal();
    }
    
    public final boolean d() {
        return this.a(abll.f, abll.i);
    }
    
    public final boolean e() {
        return this.d() || this.b();
    }
    
    public final boolean f() {
        return this.a(abll.h, abll.i);
    }
    
    public final boolean g() {
        return this.a(abll.d) || this.h();
    }
    
    public final boolean h() {
        return this.a(abll.e, abll.f);
    }
}
