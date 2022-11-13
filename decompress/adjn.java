// 
// Decompiled by Procyon v0.6.0
// 

public final class adjn implements asjs
{
    public static final adjn a;
    public static final adjn b;
    public static final adjn c;
    public static final adjn d;
    public static final adjn e;
    public static final adjn f;
    public static final adjn g;
    public static final adjn h;
    public static final adjn i;
    public static final adjn j;
    public static final adjn k;
    public static final adjn l;
    public static final adjn m;
    public static final adjn n;
    public static final adjn o;
    private final int p;
    
    static {
        o = new adjn(14);
        n = new adjn(13);
        m = new adjn(12);
        l = new adjn(11);
        k = new adjn(10);
        j = new adjn(9);
        i = new adjn(8);
        h = new adjn(7);
        g = new adjn(6);
        f = new adjn(5);
        e = new adjn(4);
        d = new adjn(3);
        c = new adjn(2);
        b = new adjn(1);
        a = new adjn(0);
    }
    
    public adjn(final int p) {
        this.p = p;
    }
    
    public final boolean a(final Object o) {
        switch (this.p) {
            default: {
                return true;
            }
            case 15: {
                return false;
            }
            case 14: {
                return (((admv)o).b & 0x4) != 0x0;
            }
            case 13: {
                final admv admv = (admv)o;
                return !admv.w || admv.x;
            }
            case 12: {
                return (int)o != 0;
            }
            case 11: {
                final long longValue = (long)o;
                final int a = tnz.a;
                return tpe.cY(longValue, a) != tpe.cT(longValue, a);
            }
            case 10: {
                return (((admv)o).b & 0x10) != 0x0;
            }
            case 9: {
                final admv admv2 = (admv)o;
                final int t = adjv.t;
                return admv2.ay.size() > 0;
            }
            case 8: {
                final admv admv3 = (admv)o;
                final int t2 = adjv.t;
                return admv3.X.size() > 0;
            }
            case 7: {
                return (((admv)o).b & 0x80) != 0x0;
            }
            case 6: {
                return (((admv)o).b & 0x2) != 0x0;
            }
            case 5: {
                return (((admv)o).b & 0x20000) != 0x0;
            }
            case 4: {
                return (((admv)o).b & 0x40000) != 0x0;
            }
            case 3: {
                return (((admv)o).b & 0x20) != 0x0;
            }
            case 2: {
                return (((admv)o).d & 0x1000) != 0x0;
            }
            case 1: {
                return (((admv)o).d & 0x2000) != 0x0;
            }
            case 0: {
                return (((admv)o).d & 0x800) != 0x0;
            }
        }
    }
}
