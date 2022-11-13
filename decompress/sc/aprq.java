import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprq extends ahbh implements ahcw
{
    public static final aprq a;
    private static volatile ahdd p;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public ajut g;
    public aiqj h;
    public anuv i;
    public ahbx j;
    public apqv k;
    public apqv l;
    public anuv m;
    public int n;
    public ahab o;
    private ahhu q;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)aprq.class, (ahbh)(a = new aprq()));
    }
    
    private aprq() {
        this.c = 0;
        this.e = 0;
        this.r = 2;
        this.j = emptyProtobufList();
        emptyProtobufList();
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
                if ((p3 = aprq.p) == null) {
                    synchronized (aprq.class) {
                        if (aprq.p == null) {
                            aprq.p = (ahdd)new ahba((ahbh)aprq.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aprq.a;
            }
            case 4: {
                return new ahaz((ahbh)aprq.a);
            }
            case 3: {
                return new aprq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprq.a, "\u0001\u000f\u0002\u0001\u0001\u000f\u000f\u0000\u0001\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u143c\u0000\u0004\u041b\u0005\u143c\u0001\u0006\u1009\b\u0007\u1409\f\b\u100a\r\t\u143c\u0001\n\u143c\u0001\u000b\u1409\n\f\u1409\u0002\r\u1009\t\u000e\u143c\u0001\u000f\u100c\u000b", new Object[] { "d", "c", "f", "e", "b", "g", "h", ajut.class, "j", aprc.class, aotp.class, "k", "q", "o", ajut.class, aida.class, "m", "i", "l", anuv.class, "n", apow.r });
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
