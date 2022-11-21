// 
// Decompiled by Procyon v0.6.0
// 

public enum aigg implements ahdd
{
    a("CAPTIONS_INITIAL_STATE_UNKNOWN", 0, 0), 
    b("CAPTIONS_INITIAL_STATE_OFF_RECOMMENDED", 1, 1), 
    c("CAPTIONS_INITIAL_STATE_OFF_REQUIRED", 2, 2), 
    d("CAPTIONS_INITIAL_STATE_ON_RECOMMENDED", 3, 3), 
    e("CAPTIONS_INITIAL_STATE_ON_REQUIRED", 4, 4);
    
    private static final aigg[] f;
    private final int g;
    
    private aigg(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahdf a() {
        return aiga.c;
    }
    
    public static aigg b(final int n) {
        if (n == 0) {
            return aigg.a;
        }
        if (n == 1) {
            return aigg.b;
        }
        if (n == 2) {
            return aigg.c;
        }
        if (n == 3) {
            return aigg.d;
        }
        if (n != 4) {
            return null;
        }
        return aigg.e;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
