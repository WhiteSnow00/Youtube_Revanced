import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajib extends ahcz implements aheo
{
    public static final ajib a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public ajia d;
    public ajid e;
    public aqif f;
    private byte h;
    
    static {
        final ajib a2 = new ajib();
        ahcz.registerDefaultInstance(ajib.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqia.a, a2, (MessageLite)a2, null, 372117054, ahgc.k, ajib.class);
    }
    
    private ajib() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = ajib.g) == null) {
                    synchronized (ajib.class) {
                        if (ajib.g == null) {
                            ajib.g = (ahev)new ahcs((ahcz)ajib.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajib.a;
            }
            case 4: {
                return new ahcr((ahcz)ajib.a);
            }
            case 3: {
                return new ajib();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajib.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
