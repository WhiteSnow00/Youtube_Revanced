import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovi extends ahbh implements ahcw
{
    public static final aovi a;
    private static volatile ahdd p;
    public int b;
    public anof c;
    public String d;
    public ajut e;
    public ajut f;
    public anuv g;
    public anuv h;
    public float i;
    public aovg j;
    public aovh k;
    public aovf l;
    public long m;
    public ahab n;
    public aiqj o;
    private ahhu q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)aovi.class, (ahbh)(a = new aovi()));
    }
    
    private aovi() {
        this.r = 2;
        this.d = "";
        this.n = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd p3;
                if ((p3 = aovi.p) == null) {
                    synchronized (aovi.class) {
                        if (aovi.p == null) {
                            aovi.p = (ahdd)new ahba((ahbh)aovi.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aovi.a;
            }
            case 4: {
                return new ahaz((ahbh)aovi.a);
            }
            case 3: {
                return new aovi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovi.a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1001\u0006\b\u1009\u0007\t\u1009\b\n\u1009\t\u000b\u1002\n\f\u100a\f\r\u1409\r\u000f\u1409\u000e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "o" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
