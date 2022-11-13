import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apte extends ahbh implements ahcw
{
    public static final apte a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private ajut e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private aiqj k;
    private anuv l;
    private aptd m;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)apte.class, (ahbh)(a = new apte()));
    }
    
    private apte() {
        this.o = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apte.b) == null) {
                    synchronized (apte.class) {
                        if (apte.b == null) {
                            apte.b = (ahdd)new ahba((ahbh)apte.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apte.a;
            }
            case 4: {
                return new ahaz((ahbh)apte.a);
            }
            case 3: {
                return new apte();
            }
            case 2: {
                return newMessageInfo((MessageLite)apte.a, "\u0001\u000b\u0000\u0001\u0002\u000f\u000b\u0000\u0000\u000b\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0007\u1409\b\b\u1409\n\n\u1409\u000e\u000b\u1409\u0006\f\u1409\t\r\u1409\u0000\u000f\u1409\u000b", new Object[] { "c", "e", "f", "g", "h", "j", "l", "n", "i", "k", "d", "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
