// 
// Decompiled by Procyon v0.6.0
// 

public enum ahft implements agzm
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
    
    public final int m;
    
    private ahft(final String s, final int n, final int m) {
        this.m = m;
    }
    
    public static agzo a() {
        return ahec.j;
    }
    
    public static ahft b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return ahft.l;
            }
            case 10: {
                return ahft.k;
            }
            case 9: {
                return ahft.j;
            }
            case 8: {
                return ahft.i;
            }
            case 7: {
                return ahft.h;
            }
            case 6: {
                return ahft.g;
            }
            case 5: {
                return ahft.f;
            }
            case 4: {
                return ahft.e;
            }
            case 3: {
                return ahft.d;
            }
            case 2: {
                return ahft.c;
            }
            case 1: {
                return ahft.b;
            }
            case 0: {
                return ahft.a;
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
