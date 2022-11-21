// 
// Decompiled by Procyon v0.6.0
// 

public enum ahjj implements ahdd
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
    
    private static final ahjj[] m;
    public final int l;
    
    private ahjj(final String s, final int n, final int l) {
        this.l = l;
    }
    
    public static ahdf a() {
        return ahhs.k;
    }
    
    public static ahjj b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 10: {
                return ahjj.k;
            }
            case 9: {
                return ahjj.j;
            }
            case 8: {
                return ahjj.i;
            }
            case 7: {
                return ahjj.h;
            }
            case 6: {
                return ahjj.g;
            }
            case 5: {
                return ahjj.f;
            }
            case 4: {
                return ahjj.e;
            }
            case 3: {
                return ahjj.d;
            }
            case 2: {
                return ahjj.c;
            }
            case 1: {
                return ahjj.b;
            }
            case 0: {
                return ahjj.a;
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
