// 
// Decompiled by Procyon v0.6.0
// 

public enum aooi implements agzm
{
    a("UNKNOWN_EVENT_TAG", 0, 0), 
    b("POST_INIT", 1, 1);
    
    public final int c;
    
    private aooi(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static agzo a() {
        return aonj.g;
    }
    
    public static aooi b(final int n) {
        if (n == 0) {
            return aooi.a;
        }
        if (n != 1) {
            return null;
        }
        return aooi.b;
    }
    
    @Override
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
