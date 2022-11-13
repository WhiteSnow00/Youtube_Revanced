// 
// Decompiled by Procyon v0.6.0
// 

public enum alai implements ahbl
{
    a("MAIN_SUGGEST_MODE_UNSPECIFIED", 0, 0), 
    b("MAIN_SUGGEST_MODE_SHORTS_CONTEXTUAL", 1, 1);
    
    private static final alai[] d;
    public final int c;
    
    private alai(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static ahbn a() {
        return akwi.j;
    }
    
    public static alai b(final int n) {
        if (n == 0) {
            return alai.a;
        }
        if (n != 1) {
            return null;
        }
        return alai.b;
    }
    
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
