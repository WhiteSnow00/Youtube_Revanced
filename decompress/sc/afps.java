import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afps extends ahbh implements ahcw
{
    public static final afps a;
    public static final ahbf b;
    private static volatile ahdd d;
    public int c;
    private Object e;
    private byte f;
    
    static {
        final afps a2 = new afps();
        ahbh.registerDefaultInstance((Class)afps.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)afqi.a, (Object)a2, (MessageLite)a2, (ahbm)null, 772, ahek.k, (Class)afps.class);
    }
    
    private afps() {
        this.c = 0;
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
                final ahdd d;
                if ((d = afps.d) == null) {
                    synchronized (afps.class) {
                        if (afps.d == null) {
                            afps.d = (ahdd)new ahba((ahbh)afps.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afps.a;
            }
            case 4: {
                return new ahaz((ahbh)afps.a);
            }
            case 3: {
                return new afps();
            }
            case 2: {
                return newMessageInfo((MessageLite)afps.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u143c\u0000", new Object[] { "e", "c", afre.class, afrd.class });
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
