import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmy extends ahbh implements ahcw
{
    public static final akmy a;
    private static volatile ahdd e;
    public int b;
    public aklg c;
    public akmx d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akmy.class, (ahbh)(a = new akmy()));
    }
    
    private akmy() {
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
                final ahdd e;
                if ((e = akmy.e) == null) {
                    synchronized (akmy.class) {
                        if (akmy.e == null) {
                            akmy.e = (ahdd)new ahba((ahbh)akmy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akmy.a;
            }
            case 4: {
                return new ahaz((ahbh)akmy.a);
            }
            case 3: {
                return new akmy();
            }
            case 2: {
                return newMessageInfo((MessageLite)akmy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
