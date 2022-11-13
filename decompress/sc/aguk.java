// 
// Decompiled by Procyon v0.6.0
// 

public enum aguk implements ahbl
{
    a("INVALID", 0, 0), 
    b("SWITCH_MEDIA", 1, 1), 
    c("ALTER_POSITION", 2, 2), 
    d("ALTER_PLAYBACK_STATE", 3, 3), 
    e("ALTER_SPEED", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private static final aguk[] g;
    private final int h;
    
    private aguk(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static aguk a(final int n) {
        if (n == 0) {
            return aguk.a;
        }
        if (n == 1) {
            return aguk.b;
        }
        if (n == 2) {
            return aguk.c;
        }
        if (n == 3) {
            return aguk.d;
        }
        if (n != 4) {
            return null;
        }
        return aguk.e;
    }
    
    public final int getNumber() {
        if (this != aguk.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
