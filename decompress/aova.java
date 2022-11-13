import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aova extends ahbh implements ahcw
{
    public static final aova a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ajut g;
    private aiqj h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aova.class, (ahbh)(a = new aova()));
    }
    
    private aova() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aova.b) == null) {
                    synchronized (aova.class) {
                        if (aova.b == null) {
                            aova.b = (ahdd)new ahba((ahbh)aova.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aova.a;
            }
            case 4: {
                return new ahaz((ahbh)aova.a);
            }
            case 3: {
                return new aova();
            }
            case 2: {
                return newMessageInfo((MessageLite)aova.a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0005\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0006\u0006\u1409\u0004\u0007\u1409\u0005", new Object[] { "c", "d", "e", "h", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
