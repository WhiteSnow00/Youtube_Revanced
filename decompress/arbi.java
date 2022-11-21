// 
// Decompiled by Procyon v0.6.0
// 

public enum arbi implements ahdd
{
    a("ADD_STICKER", 0, 1), 
    b("ADD_TEXT", 1, 2);
    
    private static final arbi[] c;
    private final int d;
    
    private arbi(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahdf a() {
        return aqym.l;
    }
    
    public static arbi b(final int n) {
        if (n == 1) {
            return arbi.a;
        }
        if (n != 2) {
            return null;
        }
        return arbi.b;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
