// 
// Decompiled by Procyon v0.6.0
// 

public enum alnu implements ahbl
{
    a("UNKNOWN", 0, 0), 
    b("FLASHACCESS", 1, 1), 
    c("WIDEVINE_CLASSIC", 2, 2), 
    d("FAIRPLAY", 3, 6), 
    e("CLEARKEY", 4, 3), 
    f("WIDEVINE", 5, 4), 
    g("PLAYREADY", 6, 5);
    
    private static final alnu[] h;
    private final int i;
    
    private alnu(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahbn a() {
        return alnf.d;
    }
    
    public static alnu b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return alnu.d;
            }
            case 5: {
                return alnu.g;
            }
            case 4: {
                return alnu.f;
            }
            case 3: {
                return alnu.e;
            }
            case 2: {
                return alnu.c;
            }
            case 1: {
                return alnu.b;
            }
            case 0: {
                return alnu.a;
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
