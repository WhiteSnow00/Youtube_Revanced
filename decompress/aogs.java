import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogs extends ahbh implements ahcw
{
    public static final aogs a;
    private static volatile ahdd b;
    private int c;
    private anqu d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aogs.class, (ahbh)(a = new aogs()));
    }
    
    private aogs() {
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
                if ((b = aogs.b) == null) {
                    synchronized (aogs.class) {
                        if (aogs.b == null) {
                            aogs.b = (ahdd)new ahba((ahbh)aogs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aogs.a;
            }
            case 4: {
                return new ahaz((ahbh)aogs.a);
            }
            case 3: {
                return new aogs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogs.a, "\u0001\u0001\u0000\u0001\ue38d\u3781\ue38d\u3781\u0001\u0000\u0000\u0001\ue38d\u3781\u1409\u0000", new Object[] { "c", "d" });
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
