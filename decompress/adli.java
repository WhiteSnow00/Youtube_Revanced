// 
// Decompiled by Procyon v0.6.0
// 

public final class adli implements asmn
{
    public static final adli a;
    public static final adli b;
    public static final adli c;
    public static final adli d;
    public static final adli e;
    public static final adli f;
    public static final adli g;
    private final int h;
    
    static {
        g = new adli(6);
        f = new adli(5);
        e = new adli(4);
        d = new adli(3);
        c = new adli(2);
        b = new adli(1);
        a = new adli(0);
    }
    
    private adli(final int h) {
        this.h = h;
    }
    
    @Override
    public final Object a(final Object o) {
        final int h = this.h;
        if (h == 0) {
            return ((adoj)o).f;
        }
        if (h == 1) {
            final ahcr ahcr = (ahcr)o;
            ahcr.copyOnWrite();
            final adoj adoj = (adoj)ahcr.instance;
            final adoj a = adoj.a;
            adoj.X = ahcz.emptyProtobufList();
            return ahcr;
        }
        if (h == 2) {
            adoh adoh;
            if ((adoh = adoh.a(((adoj)o).l)) == null) {
                adoh = adoh.a;
            }
            return adoh;
        }
        if (h == 3) {
            return ((adoj)o).X;
        }
        if (h == 4) {
            return ((adoj)o).ay;
        }
        if (h != 5) {
            adon adon;
            if ((adon = ((adoj)o).i) == null) {
                adon = adon.a;
            }
            return adon;
        }
        final ahcr ahcr2 = (ahcr)o;
        ahcr2.copyOnWrite();
        final adoj adoj2 = (adoj)ahcr2.instance;
        final adoj a2 = adoj.a;
        adoj2.aw = null;
        adoj2.d &= 0xFFFFF7FF;
        return ahcr2;
    }
}
