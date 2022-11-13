import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoji extends ahbh implements ahcw
{
    public static final aoji a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private anuv e;
    private anuv f;
    private anuv g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aoji.class, (ahbh)(a = new aoji()));
    }
    
    private aoji() {
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
                if ((b = aoji.b) == null) {
                    synchronized (aoji.class) {
                        if (aoji.b == null) {
                            aoji.b = (ahdd)new ahba((ahbh)aoji.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoji.a;
            }
            case 4: {
                return new ahaz((ahbh)aoji.a);
            }
            case 3: {
                return new aoji();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoji.a, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0004\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0006\u0007\u1409\u0005", new Object[] { "c", "d", "e", "g", "f" });
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
