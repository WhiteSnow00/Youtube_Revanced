import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomo extends ahbh implements ahcw
{
    public static final aomo a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aomo.class, (ahbh)(a = new aomo()));
    }
    
    private aomo() {
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
                if ((b = aomo.b) == null) {
                    synchronized (aomo.class) {
                        if (aomo.b == null) {
                            aomo.b = (ahdd)new ahba((ahbh)aomo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aomo.a;
            }
            case 4: {
                return new ahaz((ahbh)aomo.a);
            }
            case 3: {
                return new aomo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomo.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
