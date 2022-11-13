import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxw extends ahbh implements ahcw
{
    public static final aoxw a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxw.class, (ahbh)(a = new aoxw()));
    }
    
    private aoxw() {
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
                final ahdd b;
                if ((b = aoxw.b) == null) {
                    synchronized (aoxw.class) {
                        if (aoxw.b == null) {
                            aoxw.b = (ahdd)new ahba((ahbh)aoxw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxw.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxw.a);
            }
            case 3: {
                return new aoxw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxw.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
