// 
// Decompiled by Procyon v0.6.0
// 

public enum alne implements ahbl
{
    a("PLAYBACK_TYPE_UNKNOWN", 0, 0), 
    b("PLAYBACK_TYPE_APPLICATION", 1, 1), 
    c("PLAYBACK_TYPE_ADS", 2, 2), 
    d("PLAYBACK_TYPE_REMOTE", 3, 3), 
    e("PLAYBACK_TYPE_SECONDARY_CAMERA", 4, 4), 
    f("PLAYBACK_TYPE_PREROLL_INTERSTITIAL", 5, 5), 
    g("PLAYBACK_TYPE_POSTROLL_INTERSTITIAL", 6, 6), 
    h("PLAYBACK_TYPE_MIDROLL_INTERSTITIAL", 7, 7);
    
    private static final alne[] j;
    public final int i;
    
    private alne(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahbn a() {
        return alna.h;
    }
    
    public static alne b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return alne.h;
            }
            case 6: {
                return alne.g;
            }
            case 5: {
                return alne.f;
            }
            case 4: {
                return alne.e;
            }
            case 3: {
                return alne.d;
            }
            case 2: {
                return alne.c;
            }
            case 1: {
                return alne.b;
            }
            case 0: {
                return alne.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}
