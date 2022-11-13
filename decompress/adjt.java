// 
// Decompiled by Procyon v0.6.0
// 

public final class adjt implements asjr
{
    public static final adjt a;
    public static final adjt b;
    public static final adjt c;
    public static final adjt d;
    public static final adjt e;
    public static final adjt f;
    private final int g;
    
    static {
        f = new adjt(5);
        e = new adjt(4);
        d = new adjt(3);
        c = new adjt(2);
        b = new adjt(1);
        a = new adjt(0);
    }
    
    private adjt(final int g) {
        this.g = g;
    }
    
    public final Object a(final Object o) {
        final int g = this.g;
        if (g == 0) {
            admt admt;
            if ((admt = admt.a(((admv)o).l)) == null) {
                admt = admt.a;
            }
            return admt;
        }
        if (g == 1) {
            return ((admv)o).f;
        }
        if (g == 2) {
            return ((admv)o).X;
        }
        if (g == 3) {
            return ((admv)o).ay;
        }
        if (g != 4) {
            admz admz;
            if ((admz = ((admv)o).i) == null) {
                admz = admz.a;
            }
            return admz;
        }
        final ahaz ahaz = (ahaz)o;
        ahaz.copyOnWrite();
        final admv admv = (admv)ahaz.instance;
        final admv a = admv.a;
        admv.aw = null;
        admv.d &= 0xFFFFF7FF;
        return ahaz;
    }
}
