// 
// Decompiled by Procyon v0.6.0
// 

final class mpa
{
    public static final mpa a;
    final boolean b;
    
    static {
        a = new mpa(true);
    }
    
    public mpa() {
        this(false);
    }
    
    public mpa(final boolean b) {
        this.b = b;
    }
    
    static mpa a() {
        return new mpa(false);
    }
    
    static mpa b() {
        return new mpa(false);
    }
}
