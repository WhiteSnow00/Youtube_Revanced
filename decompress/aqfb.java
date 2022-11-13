import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfb extends ahbh implements ahcw
{
    public static final aqfb a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public aqhh d;
    public aqfg e;
    public aqfc f;
    private byte h;
    
    static {
        final aqfb a2 = new aqfb();
        ahbh.registerDefaultInstance((Class)aqfb.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhl.a, (Object)a2, (MessageLite)a2, (ahbm)null, 168777401, ahek.k, (Class)aqfb.class);
    }
    
    private aqfb() {
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
                if ((g = aqfb.g) == null) {
                    synchronized (aqfb.class) {
                        if (aqfb.g == null) {
                            aqfb.g = (ahdd)new ahba((ahbh)aqfb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqfb.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfb.a);
            }
            case 3: {
                return new aqfb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfb.a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
