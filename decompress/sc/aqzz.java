// 
// Decompiled by Procyon v0.6.0
// 

public enum aqzz implements ahbl
{
    a("KEYFRAME_LABEL_UNSPECIFIED", 0, 0), 
    b("KEYFRAME_LABEL_START", 1, 1), 
    c("KEYFRAME_LABEL_END", 2, 2);
    
    private static final aqzz[] e;
    public final int d;
    
    private aqzz(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return aqvs.q;
    }
    
    public static aqzz b(final int n) {
        if (n == 0) {
            return aqzz.a;
        }
        if (n == 1) {
            return aqzz.b;
        }
        if (n != 2) {
            return null;
        }
        return aqzz.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
