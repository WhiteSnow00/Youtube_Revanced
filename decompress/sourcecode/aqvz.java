// 
// Decompiled by Procyon v0.6.0
// 

public enum aqvz implements agzm
{
    a("ADD_STICKER", 0, 1), 
    b("ADD_TEXT", 1, 2);
    
    private final int d;
    
    private aqvz(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return aqtg.j;
    }
    
    public static aqvz b(final int n) {
        if (n == 1) {
            return aqvz.a;
        }
        if (n != 2) {
            return null;
        }
        return aqvz.b;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
