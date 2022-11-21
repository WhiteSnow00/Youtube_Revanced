// 
// Decompiled by Procyon v0.6.0
// 

public final class apkc implements ahdf
{
    static final ahdf a;
    static final ahdf b;
    static final ahdf c;
    static final ahdf d;
    static final ahdf e;
    static final ahdf f;
    static final ahdf g;
    static final ahdf h;
    static final ahdf i;
    static final ahdf j;
    public static final ahdf k;
    static final ahdf l;
    static final ahdf m;
    static final ahdf n;
    static final ahdf o;
    static final ahdf p;
    static final ahdf q;
    public static final ahdf r;
    static final ahdf s;
    static final ahdf t;
    static final ahdf u;
    private final int v;
    
    static {
        u = (ahdf)new apkc(20);
        t = (ahdf)new apkc(19);
        s = (ahdf)new apkc(18);
        r = (ahdf)new apkc(17);
        q = (ahdf)new apkc(16);
        p = (ahdf)new apkc(15);
        o = (ahdf)new apkc(14);
        n = (ahdf)new apkc(13);
        m = (ahdf)new apkc(12);
        l = (ahdf)new apkc(11);
        k = (ahdf)new apkc(10);
        j = (ahdf)new apkc(9);
        i = (ahdf)new apkc(8);
        h = (ahdf)new apkc(7);
        g = (ahdf)new apkc(6);
        f = (ahdf)new apkc(5);
        e = (ahdf)new apkc(4);
        d = (ahdf)new apkc(3);
        c = (ahdf)new apkc(2);
        b = (ahdf)new apkc(1);
        a = (ahdf)new apkc(0);
    }
    
    private apkc(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        switch (this.v) {
            default: {
                if (aqvq.an(n) != 0) {
                    return true;
                }
                break;
            }
            case 19: {
                return aqvq.ao(n) != 0;
            }
            case 18: {
                return aqvq.ap(n) != 0;
            }
            case 17: {
                return n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5;
            }
            case 16: {
                return aplu.b(n) != null;
            }
            case 15: {
                return aplk.b(n) != null;
            }
            case 14: {
                return aplj.b(n) != null;
            }
            case 13: {
                return n == 0 || n == 1;
            }
            case 12: {
                return aqvq.aq(n) != 0;
            }
            case 11: {
                return aqvq.ar(n) != 0;
            }
            case 10: {
                return aqvq.as(n) != 0;
            }
            case 9: {
                return apki.b(n) != null;
            }
            case 8: {
                return n == 0 || n == 1 || n == 2 || n == 3;
            }
            case 7: {
                switch (n) {
                    default: {
                        return false;
                    }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: {
                        return true;
                    }
                }
                break;
            }
            case 6: {
                return apkh.b(n) != null;
            }
            case 5: {
                return apkg.b(n) != null;
            }
            case 4: {
                return apkf.b(n) != null;
            }
            case 3: {
                return apke.b(n) != null;
            }
            case 2: {
                return aqvq.at(n) != 0;
            }
            case 1: {
                return apkb.b(n) != null;
            }
            case 0: {
                if (apkd.b(n) != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
