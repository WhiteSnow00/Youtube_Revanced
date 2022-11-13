import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlm extends ahbh implements ahcw
{
    public static final ahlm a;
    private static volatile ahdd d;
    public int b;
    public aiqj c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ahlm.class, (ahbh)(a = new ahlm()));
    }
    
    private ahlm() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ahlm.d) == null) {
                    synchronized (ahlm.class) {
                        if (ahlm.d == null) {
                            ahlm.d = (ahdd)new ahba((ahbh)ahlm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahlm.a;
            }
            case 4: {
                return new ahaz((ahbh)ahlm.a);
            }
            case 3: {
                return new ahlm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1409\u0001", new Object[] { "e", "b", aili.a(), "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
