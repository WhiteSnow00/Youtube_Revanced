import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aokc extends ahbh implements ahcw
{
    public static final aokc a;
    private static volatile ahdd b;
    private int c;
    private anuv d;
    private ajut e;
    private ajut f;
    private anuv g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aokc.class, (ahbh)(a = new aokc()));
    }
    
    private aokc() {
        this.h = 2;
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
                if ((b = aokc.b) == null) {
                    synchronized (aokc.class) {
                        if (aokc.b == null) {
                            aokc.b = (ahdd)new ahba((ahbh)aokc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aokc.a;
            }
            case 4: {
                return new ahaz((ahbh)aokc.a);
            }
            case 3: {
                return new aokc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aokc.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
