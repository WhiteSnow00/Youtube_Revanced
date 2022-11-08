// 
// Decompiled by Procyon v0.6.0
// 

public enum oaz implements agzm
{
    a("HOST_APP_UNKNOWN", 0, 0), 
    b("HOST_APP_HAM", 1, 1), 
    c("HOST_APP_MIG", 2, 2), 
    d("HOST_APP_DUET", 3, 3), 
    e("HOST_APP_FAKE_TACHYON", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private final int h;
    
    private oaz(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static oaz a(final int n) {
        if (n == 0) {
            return oaz.a;
        }
        if (n == 1) {
            return oaz.b;
        }
        if (n == 2) {
            return oaz.c;
        }
        if (n == 3) {
            return oaz.d;
        }
        if (n != 4) {
            return null;
        }
        return oaz.e;
    }
    
    @Override
    public final int getNumber() {
        if (this != oaz.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
