import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anar extends ahbh implements ahcw
{
    public static final anar a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)anar.class, (ahbh)(a = new anar()));
    }
    
    private anar() {
        this.g = 2;
        emptyProtobufList();
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
                final ahdd b;
                if ((b = anar.b) == null) {
                    synchronized (anar.class) {
                        if (anar.b == null) {
                            anar.b = (ahdd)new ahba((ahbh)anar.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anar.a;
            }
            case 4: {
                return new ahaz((ahbh)anar.a);
            }
            case 3: {
                return new anar();
            }
            case 2: {
                return newMessageInfo((MessageLite)anar.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
