import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgc extends ahbh implements ahcw
{
    public static final ajgc a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public ajgb d;
    public ajge e;
    public aqfl f;
    private byte h;
    
    static {
        final ajgc a2 = new ajgc();
        ahbh.registerDefaultInstance((Class)ajgc.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 372117054, ahek.k, (Class)ajgc.class);
    }
    
    private ajgc() {
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
                if ((g = ajgc.g) == null) {
                    synchronized (ajgc.class) {
                        if (ajgc.g == null) {
                            ajgc.g = (ahdd)new ahba((ahbh)ajgc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajgc.a;
            }
            case 4: {
                return new ahaz((ahbh)ajgc.a);
            }
            case 3: {
                return new ajgc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgc.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
