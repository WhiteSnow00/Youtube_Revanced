import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjo extends ahbh implements ahcw
{
    public static final aqjo a;
    private static volatile ahdd b;
    private int c;
    private aqhx d;
    private aiqj e;
    private aiqj f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjo.class, (ahbh)(a = new aqjo()));
    }
    
    private aqjo() {
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
                if ((b = aqjo.b) == null) {
                    synchronized (aqjo.class) {
                        if (aqjo.b == null) {
                            aqjo.b = (ahdd)new ahba((ahbh)aqjo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqjo.a;
            }
            case 4: {
                return new ahaz((ahbh)aqjo.a);
            }
            case 3: {
                return new aqjo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjo.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
