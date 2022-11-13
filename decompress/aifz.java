import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifz extends ahbh implements ahcw
{
    public static final aifz a;
    private static volatile ahdd b;
    private int c;
    private aida d;
    private aida e;
    private aiqj f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aifz.class, (ahbh)(a = new aifz()));
    }
    
    private aifz() {
        this.g = 2;
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
                if ((b = aifz.b) == null) {
                    synchronized (aifz.class) {
                        if (aifz.b == null) {
                            aifz.b = (ahdd)new ahba((ahbh)aifz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifz.a;
            }
            case 4: {
                return new ahaz((ahbh)aifz.a);
            }
            case 3: {
                return new aifz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
