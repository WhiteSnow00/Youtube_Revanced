// 
// Decompiled by Procyon v0.6.0
// 

public enum alnc implements ahbl
{
    a("LATENCY_PLAYER_SET_OPERATION_TYPE_UNKNOWN", 0, 0), 
    b("LATENCY_PLAYER_SET_OPERATION_TYPE_START", 1, 1), 
    c("LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT", 2, 4), 
    d("LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS", 3, 5), 
    e("LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP", 4, 6), 
    f("LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV", 5, 12), 
    g("LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY", 6, 13), 
    h("LATENCY_PLAYER_SET_OPERATION_TYPE_SWIPE_NEXT", 7, 9), 
    i("LATENCY_PLAYER_SET_OPERATION_TYPE_SWIPE_PREVIOUS", 8, 10), 
    j("LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOPLAY", 9, 2), 
    k("LATENCY_PLAYER_SET_OPERATION_TYPE_AUTONAV", 10, 3), 
    l("LATENCY_PLAYER_SET_OPERATION_TYPE_URL", 11, 7), 
    m("LATENCY_PLAYER_SET_OPERATION_TYPE_RETRY", 12, 8), 
    n("LATENCY_PLAYER_SET_OPERATION_TYPE_MUTED_AUTOPLAY", 13, 11);
    
    private static final alnc[] p;
    public final int o;
    
    private alnc(final String s, final int n, final int o) {
        this.o = o;
    }
    
    public static ahbn a() {
        return alna.c;
    }
    
    public static alnc b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 13: {
                return alnc.g;
            }
            case 12: {
                return alnc.f;
            }
            case 11: {
                return alnc.n;
            }
            case 10: {
                return alnc.i;
            }
            case 9: {
                return alnc.h;
            }
            case 8: {
                return alnc.m;
            }
            case 7: {
                return alnc.l;
            }
            case 6: {
                return alnc.e;
            }
            case 5: {
                return alnc.d;
            }
            case 4: {
                return alnc.c;
            }
            case 3: {
                return alnc.k;
            }
            case 2: {
                return alnc.j;
            }
            case 1: {
                return alnc.b;
            }
            case 0: {
                return alnc.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.o;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.o);
    }
}
