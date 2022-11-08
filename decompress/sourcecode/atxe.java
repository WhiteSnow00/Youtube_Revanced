// 
// Decompiled by Procyon v0.6.0
// 

public enum atxe implements agzm
{
    a("REQUEST_STATUS_UNSPECIFIED", 0, 0), 
    b("SUCCEEDED", 1, 1), 
    c("FAILED", 2, 2), 
    d("CANCELED", 3, 3);
    
    public final int e;
    
    private atxe(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return arbt.m;
    }
    
    public static atxe b(final int n) {
        if (n == 0) {
            return atxe.a;
        }
        if (n == 1) {
            return atxe.b;
        }
        if (n == 2) {
            return atxe.c;
        }
        if (n != 3) {
            return null;
        }
        return atxe.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
