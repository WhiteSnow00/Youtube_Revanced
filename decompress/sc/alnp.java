// 
// Decompiled by Procyon v0.6.0
// 

public enum alnp implements ahbl
{
    a("LENS_LAUNCH_STATUS_UNKNOWN", 0, 0), 
    b("LENS_LAUNCH_STATUS_SUCCESS", 1, 1), 
    c("LENS_LAUNCH_STATUS_NO_PLAYER_VIEW", 2, 2), 
    d("LENS_LAUNCH_STATUS_NO_PLAYER_SURFACE", 3, 3), 
    e("LENS_LAUNCH_STATUS_BAD_ANDROID_SDK_VERSION", 4, 4), 
    f("LENS_LAUNCH_STATUS_PIXELCOPY_FAILED", 5, 5), 
    g("LENS_LAUNCH_STATUS_LENS_NOT_AVAILABLE", 6, 6), 
    h("LENS_LAUNCH_STATUS_BITMAP_COPY_FAILED", 7, 7), 
    i("LENS_LAUNCH_STATUS_PLAYBACK_STOPPED", 8, 8);
    
    private static final alnp[] k;
    public final int j;
    
    private alnp(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public static ahbn a() {
        return alnf.c;
    }
    
    public static alnp b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 8: {
                return alnp.i;
            }
            case 7: {
                return alnp.h;
            }
            case 6: {
                return alnp.g;
            }
            case 5: {
                return alnp.f;
            }
            case 4: {
                return alnp.e;
            }
            case 3: {
                return alnp.d;
            }
            case 2: {
                return alnp.c;
            }
            case 1: {
                return alnp.b;
            }
            case 0: {
                return alnp.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.j;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}
