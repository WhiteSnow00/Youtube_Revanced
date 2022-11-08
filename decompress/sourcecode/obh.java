// 
// Decompiled by Procyon v0.6.0
// 

public enum obh implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("CONNECTING", 1, 1), 
    c("CONNECTED", 2, 2), 
    d("CONNECTED_WITH_COACTIVITY", 3, 3), 
    e("ENDING", 4, 4), 
    f("ENDED", 5, 5), 
    g("NOT_CONNECTED", 6, 6), 
    h("ENDED_UNEXPECTEDLY", 7, 7), 
    i("UNRECOGNIZED", 8, -1);
    
    private final int k;
    
    private obh(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static obh a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return obh.h;
            }
            case 6: {
                return obh.g;
            }
            case 5: {
                return obh.f;
            }
            case 4: {
                return obh.e;
            }
            case 3: {
                return obh.d;
            }
            case 2: {
                return obh.c;
            }
            case 1: {
                return obh.b;
            }
            case 0: {
                return obh.a;
            }
        }
    }
    
    @Override
    public final int getNumber() {
        if (this != obh.i) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
