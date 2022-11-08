// 
// Decompiled by Procyon v0.6.0
// 

public enum anjz implements agzm
{
    a("POST_IMPRESSION_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("POST_IMPRESSION_EVENT_TYPE_ENTER", 1, 1), 
    c("POST_IMPRESSION_EVENT_TYPE_LEAVE", 2, 2);
    
    public final int d;
    
    private anjz(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return angs.c;
    }
    
    public static anjz b(final int n) {
        if (n == 0) {
            return anjz.a;
        }
        if (n == 1) {
            return anjz.b;
        }
        if (n != 2) {
            return null;
        }
        return anjz.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
