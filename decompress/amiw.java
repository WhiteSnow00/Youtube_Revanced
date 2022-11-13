import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiw extends ahbh implements ahcw
{
    public static final amiw a;
    private static volatile ahdd g;
    public int b;
    public anuv c;
    public anuv d;
    public anuv e;
    public anuv f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)amiw.class, (ahbh)(a = new amiw()));
    }
    
    private amiw() {
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
                final ahdd g;
                if ((g = amiw.g) == null) {
                    synchronized (amiw.class) {
                        if (amiw.g == null) {
                            amiw.g = (ahdd)new ahba((ahbh)amiw.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amiw.a;
            }
            case 4: {
                return new ahaz((float[])null, (char[][])null);
            }
            case 3: {
                return new amiw();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
