// 
// Decompiled by Procyon v0.6.0
// 

public final class aadt extends RuntimeException
{
    public final boolean a;
    public final zyw b;
    public final amtj c;
    
    private aadt(final boolean a, final String s, final Exception ex, final zyw b, final amtj c) {
        super(s, ex);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static aadt a(final String s, final Exception ex, final zyw zyw, final amtj amtj) {
        return new aadt(true, s, ex, zyw, amtj);
    }
    
    public static aadt b(final String s, final Exception ex, final zyw zyw, final amtj amtj) {
        return new aadt(false, s, ex, zyw, amtj);
    }
}
