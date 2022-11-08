// 
// Decompiled by Procyon v0.6.0
// 

public final class ahec implements agzo
{
    public static final agzo a;
    public static final agzo b;
    public static final agzo c;
    public static final agzo d;
    public static final agzo e;
    public static final agzo f;
    public static final agzo g;
    public static final agzo h;
    public static final agzo i;
    public static final agzo j;
    public static final agzo k;
    public static final agzo l;
    public static final agzo m;
    public static final agzo n;
    public static final agzo o;
    public static final agzo p;
    public static final agzo q;
    public static final agzo r;
    public static final agzo s;
    public static final agzo t;
    public static final agzo u;
    private final /* synthetic */ int v;
    
    static {
        u = (agzo)new ahec(20);
        t = (agzo)new ahec(19);
        s = (agzo)new ahec(18);
        r = (agzo)new ahec(17);
        q = (agzo)new ahec(16);
        p = (agzo)new ahec(15);
        o = (agzo)new ahec(14);
        n = (agzo)new ahec(13);
        m = (agzo)new ahec(12);
        l = (agzo)new ahec(11);
        k = (agzo)new ahec(10);
        j = (agzo)new ahec(9);
        i = (agzo)new ahec(8);
        h = (agzo)new ahec(7);
        g = (agzo)new ahec(6);
        f = (agzo)new ahec(5);
        e = (agzo)new ahec(4);
        d = (agzo)new ahec(3);
        c = (agzo)new ahec(2);
        b = (agzo)new ahec(1);
        a = (agzo)new ahec(0);
    }
    
    private ahec(final int v) {
        this.v = v;
    }
    
    public final boolean isInRange(final int n) {
        Label_0550: {
            switch (this.v) {
                default: {
                    switch (n) {
                        default: {
                            return false;
                        }
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9: {
                            break Label_0550;
                        }
                    }
                    break;
                }
                case 19: {
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
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36: {
                            return true;
                        }
                    }
                    break;
                }
                case 18: {
                    return ahhi.b(n) != null;
                }
                case 17: {
                    return ahhh.b(n) != null;
                }
                case 16: {
                    return ahhg.b(n) != null;
                }
                case 15: {
                    return ahgp.b(n) != null;
                }
                case 14: {
                    return aeda.ad(n) != 0;
                }
                case 13: {
                    return aeda.ae(n) != 0;
                }
                case 12: {
                    return ahgg.b(n) != null;
                }
                case 11: {
                    return ahfv.b(n) != null;
                }
                case 10: {
                    return ahfu.b(n) != null;
                }
                case 9: {
                    return ahft.b(n) != null;
                }
                case 8: {
                    return aeda.af(n) != 0;
                }
                case 7: {
                    return ahfs.b(n) != null;
                }
                case 6: {
                    return ahfo.b(n) != null;
                }
                case 5: {
                    return ahfn.b(n) != null;
                }
                case 4: {
                    return ahfm.b(n) != null;
                }
                case 3: {
                    return ahfl.b(n) != null;
                }
                case 2: {
                    return ahet.b(n) != null;
                }
                case 1: {
                    return n == 0 || n == 1 || n == 2;
                }
                case 0: {
                    if (n != 0 && n != 1 && n != 2 && n != 3) {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
}
