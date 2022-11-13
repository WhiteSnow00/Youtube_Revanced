import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifp extends ahbh implements ahcw
{
    public static final aifp a;
    private static volatile ahdd b;
    private int c;
    private aifo d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifp.class, (ahbh)(a = new aifp()));
    }
    
    private aifp() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aifp.b) == null) {
                    synchronized (aifp.class) {
                        if (aifp.b == null) {
                            aifp.b = (ahdd)new ahba((ahbh)aifp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifp.a;
            }
            case 4: {
                return new ahaz((ahbh)aifp.a);
            }
            case 3: {
                return new aifp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifp.a, "\u0001\u0001\u0000\u0001\uff40\u1c06\uff40\u1c06\u0001\u0000\u0000\u0001\uff40\u1c06\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
