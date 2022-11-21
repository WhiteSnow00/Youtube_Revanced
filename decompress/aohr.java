// 
// Decompiled by Procyon v0.6.0
// 

public enum aohr implements ahdd
{
    a("SHORTS_FIRST_LAUNCH_TYPE_UNKNOWN", 0, 0), 
    b("SHORTS_FIRST_LAUNCH_TYPE_RESUME_TO_SHORTS", 1, 1), 
    c("SHORTS_FIRST_LAUNCH_TYPE_TARGETED", 2, 2);
    
    private static final aohr[] e;
    public final int d;
    
    private aohr(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aoha.j;
    }
    
    public static aohr b(final int n) {
        if (n == 0) {
            return aohr.a;
        }
        if (n == 1) {
            return aohr.b;
        }
        if (n != 2) {
            return null;
        }
        return aohr.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
