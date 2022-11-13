import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlc extends ahbh implements ahcw
{
    public static final ahlc a;
    private static volatile ahdd p;
    public int b;
    public int c;
    public Object d;
    public ajut e;
    public aotp f;
    public akdi g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public aiqj m;
    public ahbx n;
    public ahab o;
    private ahhu q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlc.class, (ahbh)(a = new ahlc()));
    }
    
    private ahlc() {
        this.c = 0;
        this.r = 2;
        this.n = emptyProtobufList();
        this.o = ahab.b;
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
                if ((p3 = ahlc.p) == null) {
                    synchronized (ahlc.class) {
                        if (ahlc.p == null) {
                            ahlc.p = (ahdd)new ahba((ahbh)ahlc.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ahlc.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlc.a);
            }
            case 3: {
                return new ahlc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlc.a, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u103e\u0000\u0004\u100b\u0005\u0005\u1409\t\u0006\u1409\n\u0007\u100a\u000b\b\u100b\u0006\t\u100b\b\n\u041b\f\u1409\u0002\r\u100b\u0004\u000e\u100b\u0007", new Object[] { "d", "c", "b", "e", "f", "i", "m", "q", "o", "j", "l", "n", aiqj.class, "g", "h", "k" });
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
