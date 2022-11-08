// 
// Decompiled by Procyon v0.6.0
// 

public enum amum implements agzm
{
    a("OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN", 0, 0), 
    b("OFFLINEABILITY_AVAILABILITY_TYPE_FREE", 1, 1), 
    c("OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED", 2, 2), 
    d("OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_UNLOCKED", 3, 3);
    
    public final int e;
    
    private amum(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return amtt.c;
    }
    
    public static amum b(final int n) {
        if (n == 0) {
            return amum.a;
        }
        if (n == 1) {
            return amum.b;
        }
        if (n == 2) {
            return amum.c;
        }
        if (n != 3) {
            return null;
        }
        return amum.d;
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
