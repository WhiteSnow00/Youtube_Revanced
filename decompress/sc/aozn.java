import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozn extends ahbh implements ahcw
{
    public static final aozn a;
    private static volatile ahdd c;
    public aida b;
    private int d;
    private ajut e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aozn.class, (ahbh)(a = new aozn()));
    }
    
    private aozn() {
        this.g = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aozn.c) == null) {
                    synchronized (aozn.class) {
                        if (aozn.c == null) {
                            aozn.c = (ahdd)new ahba((ahbh)aozn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aozn.a;
            }
            case 4: {
                return new ahaz((ahbh)aozn.a);
            }
            case 3: {
                return new aozn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozn.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0004\u1409\u0004\u0005\u1409\u0005", new Object[] { "d", "e", "b", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
