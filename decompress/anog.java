import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anog extends ahbh implements ahcw
{
    public static final anog a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anog.class, (ahbh)(a = new anog()));
    }
    
    private anog() {
        this.h = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anog.b) == null) {
                    synchronized (anog.class) {
                        if (anog.b == null) {
                            anog.b = (ahdd)new ahba((ahbh)anog.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anog.a;
            }
            case 4: {
                return new ahaz((ahbh)anog.a);
            }
            case 3: {
                return new anog();
            }
            case 2: {
                return newMessageInfo((MessageLite)anog.a, "\u0001\u0004\u0000\u0001\u0003\t\u0004\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\t\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
