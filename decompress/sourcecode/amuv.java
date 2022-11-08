// 
// Decompiled by Procyon v0.6.0
// 

public enum amuv implements agzm
{
    a("UNKNOWN_FORMAT_TYPE", 0, 0), 
    b("LD", 1, 4), 
    c("SD", 2, 1), 
    d("HD", 3, 2), 
    e("AUDIO_ONLY", 4, 3), 
    f("LD_240", 5, 5), 
    g("SD_480", 6, 6), 
    h("HD_1080", 7, 7), 
    i("HD_1440", 8, 8), 
    j("HD_2160", 9, 9);
    
    public final int k;
    
    private amuv(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static agzo a() {
        return amtt.e;
    }
    
    public static amuv b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return amuv.j;
            }
            case 8: {
                return amuv.i;
            }
            case 7: {
                return amuv.h;
            }
            case 6: {
                return amuv.g;
            }
            case 5: {
                return amuv.f;
            }
            case 4: {
                return amuv.b;
            }
            case 3: {
                return amuv.e;
            }
            case 2: {
                return amuv.d;
            }
            case 1: {
                return amuv.c;
            }
            case 0: {
                return amuv.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}
