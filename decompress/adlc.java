// 
// Decompiled by Procyon v0.6.0
// 

public final class adlc implements asmo
{
    public static final adlc a;
    public static final adlc b;
    public static final adlc c;
    public static final adlc d;
    public static final adlc e;
    public static final adlc f;
    public static final adlc g;
    public static final adlc h;
    public static final adlc i;
    public static final adlc j;
    public static final adlc k;
    public static final adlc l;
    public static final adlc m;
    public static final adlc n;
    public static final adlc o;
    private final int p;
    
    static {
        o = new adlc(14);
        n = new adlc(13);
        m = new adlc(12);
        l = new adlc(11);
        k = new adlc(10);
        j = new adlc(9);
        i = new adlc(8);
        h = new adlc(7);
        g = new adlc(6);
        f = new adlc(5);
        e = new adlc(4);
        d = new adlc(3);
        c = new adlc(2);
        b = new adlc(1);
        a = new adlc(0);
    }
    
    public adlc(final int p) {
        this.p = p;
    }
    
    @Override
    public final boolean a(final Object o) {
        switch (this.p) {
            default: {
                return true;
            }
            case 15: {
                return false;
            }
            case 14: {
                return (((adoj)o).b & 0x4) != 0x0;
            }
            case 13: {
                final adoj adoj = (adoj)o;
                return !adoj.w || adoj.x;
            }
            case 12: {
                return (int)o != 0;
            }
            case 11: {
                final long longValue = (long)o;
                final int a = toz.a;
                return tqf.cY(longValue, a) != tqf.cT(longValue, a);
            }
            case 10: {
                return (((adoj)o).b & 0x10) != 0x0;
            }
            case 9: {
                final adoj adoj2 = (adoj)o;
                final int t = adlk.t;
                return adoj2.ay.size() > 0;
            }
            case 8: {
                final adoj adoj3 = (adoj)o;
                final int t2 = adlk.t;
                return adoj3.X.size() > 0;
            }
            case 7: {
                return (((adoj)o).b & 0x80) != 0x0;
            }
            case 6: {
                return (((adoj)o).b & 0x2) != 0x0;
            }
            case 5: {
                return (((adoj)o).b & 0x20000) != 0x0;
            }
            case 4: {
                return (((adoj)o).b & 0x40000) != 0x0;
            }
            case 3: {
                return (((adoj)o).b & 0x20) != 0x0;
            }
            case 2: {
                return (((adoj)o).d & 0x1000) != 0x0;
            }
            case 1: {
                return (((adoj)o).d & 0x2000) != 0x0;
            }
            case 0: {
                return (((adoj)o).d & 0x800) != 0x0;
            }
        }
    }
}
