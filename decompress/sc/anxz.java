import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxz extends ahbh implements ahcw
{
    public static final anxz a;
    private static volatile ahdd c;
    public anuv b;
    private int d;
    private ajut e;
    private ajut f;
    private aiqj g;
    private ajut h;
    private anuv i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)anxz.class, (ahbh)(a = new anxz()));
    }
    
    private anxz() {
        this.k = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anxz.c) == null) {
                    synchronized (anxz.class) {
                        if (anxz.c == null) {
                            anxz.c = (ahdd)new ahba((ahbh)anxz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anxz.a;
            }
            case 4: {
                return new ahaz((ahbh)anxz.a);
            }
            case 3: {
                return new anxz();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxz.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0007\u0007\u1409\u0004\t\u1409\u0001\n\u1409\u0006", new Object[] { "d", "e", "f", "g", "j", "h", "b", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
