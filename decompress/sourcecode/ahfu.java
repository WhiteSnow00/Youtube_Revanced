// 
// Decompiled by Procyon v0.6.0
// 

public enum ahfu implements agzm
{
    a("UNKNOWN_CODEC", 0, 0), 
    b("H263", 1, 1), 
    c("H264", 2, 2), 
    d("VP8", 3, 3), 
    e("VP9", 4, 4), 
    f("H262", 5, 5), 
    g("VP6", 6, 6), 
    h("MPEG4", 7, 7), 
    i("AV1", 8, 8), 
    j("H265", 9, 9), 
    k("FLV1", 10, 10);
    
    public final int l;
    
    private ahfu(final String s, final int n, final int l) {
        this.l = l;
    }
    
    public static agzo a() {
        return ahec.k;
    }
    
    public static ahfu b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 10: {
                return ahfu.k;
            }
            case 9: {
                return ahfu.j;
            }
            case 8: {
                return ahfu.i;
            }
            case 7: {
                return ahfu.h;
            }
            case 6: {
                return ahfu.g;
            }
            case 5: {
                return ahfu.f;
            }
            case 4: {
                return ahfu.e;
            }
            case 3: {
                return ahfu.d;
            }
            case 2: {
                return ahfu.c;
            }
            case 1: {
                return ahfu.b;
            }
            case 0: {
                return ahfu.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.l;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}
