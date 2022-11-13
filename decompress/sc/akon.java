import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akon extends ahbh implements ahcw
{
    public static final akon a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akon.class, (ahbh)(a = new akon()));
    }
    
    private akon() {
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
                if ((b = akon.b) == null) {
                    synchronized (akon.class) {
                        if (akon.b == null) {
                            akon.b = (ahdd)new ahba((ahbh)akon.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akon.a;
            }
            case 4: {
                return new ahaz((ahbh)akon.a);
            }
            case 3: {
                return new akon();
            }
            case 2: {
                return newMessageInfo((MessageLite)akon.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
