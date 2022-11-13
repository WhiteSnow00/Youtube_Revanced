import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhv extends ahbh implements ahcw
{
    public static final anhv a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public ajut d;
    public akdi e;
    private byte g;
    
    static {
        final anhv a2 = new anhv();
        ahbh.registerDefaultInstance((Class)anhv.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 455964309, ahek.k, (Class)anhv.class);
    }
    
    private anhv() {
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
                final ahdd f;
                if ((f = anhv.f) == null) {
                    synchronized (anhv.class) {
                        if (anhv.f == null) {
                            anhv.f = (ahdd)new ahba((ahbh)anhv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anhv.a;
            }
            case 4: {
                return new ahaz((ahbh)anhv.a);
            }
            case 3: {
                return new anhv();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
