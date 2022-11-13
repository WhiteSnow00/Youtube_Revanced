import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifr extends ahbh implements ahcw
{
    public static final aifr a;
    private static volatile ahdd b;
    private int c;
    private aome d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifr.class, (ahbh)(a = new aifr()));
    }
    
    private aifr() {
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
                if ((b = aifr.b) == null) {
                    synchronized (aifr.class) {
                        if (aifr.b == null) {
                            aifr.b = (ahdd)new ahba((ahbh)aifr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifr.a;
            }
            case 4: {
                return new ahaz((ahbh)aifr.a);
            }
            case 3: {
                return new aifr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifr.a, "\u0001\u0001\u0000\u0001\ue2d9\u1a6d\ue2d9\u1a6d\u0001\u0000\u0000\u0001\ue2d9\u1a6d\u1409\u0000", new Object[] { "c", "d" });
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
