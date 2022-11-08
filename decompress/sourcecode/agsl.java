// 
// Decompiled by Procyon v0.6.0
// 

public enum agsl implements agzm
{
    a("INVALID", 0, 0), 
    b("SWITCH_MEDIA", 1, 1), 
    c("ALTER_POSITION", 2, 2), 
    d("ALTER_PLAYBACK_STATE", 3, 3), 
    e("ALTER_SPEED", 4, 4), 
    f("UNRECOGNIZED", 5, -1);
    
    private final int h;
    
    private agsl(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agsl a(final int n) {
        if (n == 0) {
            return agsl.a;
        }
        if (n == 1) {
            return agsl.b;
        }
        if (n == 2) {
            return agsl.c;
        }
        if (n == 3) {
            return agsl.d;
        }
        if (n != 4) {
            return null;
        }
        return agsl.e;
    }
    
    public final int getNumber() {
        if (this != agsl.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
