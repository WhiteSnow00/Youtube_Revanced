// 
// Decompiled by Procyon v0.6.0
// 

public enum ahji implements ahdd
{
    a("UNKNOWN_CODEC", 0, 0), 
    b("AAC", 1, 1), 
    c("VORBIS", 2, 2), 
    d("OPUS", 3, 3), 
    e("DTSHD", 4, 4), 
    f("EAC3", 5, 5), 
    g("PCM", 6, 6), 
    h("AC3", 7, 7), 
    i("SPEEX", 8, 8), 
    j("MP3", 9, 9), 
    k("MP2", 10, 10), 
    l("AMR", 11, 11);
    
    private static final ahji[] n;
    public final int m;
    
    private ahji(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static ahdf a() {
        return ahhs.j;
    }
    
    public static ahji b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return ahji.l;
            }
            case 10: {
                return ahji.k;
            }
            case 9: {
                return ahji.j;
            }
            case 8: {
                return ahji.i;
            }
            case 7: {
                return ahji.h;
            }
            case 6: {
                return ahji.g;
            }
            case 5: {
                return ahji.f;
            }
            case 4: {
                return ahji.e;
            }
            case 3: {
                return ahji.d;
            }
            case 2: {
                return ahji.c;
            }
            case 1: {
                return ahji.b;
            }
            case 0: {
                return ahji.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.m;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}
