// 
// Decompiled by Procyon v0.6.0
// 

public enum arcu implements ahdd
{
    a("KEYFRAME_LABEL_UNSPECIFIED", 0, 0), 
    b("KEYFRAME_LABEL_START", 1, 1), 
    c("KEYFRAME_LABEL_END", 2, 2);
    
    private static final arcu[] e;
    public final int d;
    
    private arcu(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aqym.r;
    }
    
    public static arcu b(final int n) {
        if (n == 0) {
            return arcu.a;
        }
        if (n == 1) {
            return arcu.b;
        }
        if (n != 2) {
            return null;
        }
        return arcu.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
