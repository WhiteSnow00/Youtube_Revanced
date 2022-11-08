// 
// Decompiled by Procyon v0.6.0
// 

public enum aodh implements agzm
{
    a("SHORTS_FIRST_LAUNCH_TYPE_UNKNOWN", 0, 0), 
    b("SHORTS_FIRST_LAUNCH_TYPE_RESUME_TO_SHORTS", 1, 1), 
    c("SHORTS_FIRST_LAUNCH_TYPE_TARGETED", 2, 2);
    
    public final int d;
    
    private aodh(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return aocr.h;
    }
    
    public static aodh b(final int n) {
        if (n == 0) {
            return aodh.a;
        }
        if (n == 1) {
            return aodh.b;
        }
        if (n != 2) {
            return null;
        }
        return aodh.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
