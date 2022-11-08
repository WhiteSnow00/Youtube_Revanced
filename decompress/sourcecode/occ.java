// 
// Decompiled by Procyon v0.6.0
// 

public final class occ
{
    public static final occ a;
    public final ocd b;
    public final oav c;
    public final oba d;
    
    static {
        a = new occ(ocd.a, null, null);
    }
    
    public occ(final ocd b, final oba d, final oav c) {
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public static occ a(final oav oav) {
        return new occ(ocd.b, null, oav);
    }
}
