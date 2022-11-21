import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhv extends ahcz implements aheo
{
    public static final aqhv a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public aqkb d;
    public aqia e;
    public aqhw f;
    private byte h;
    
    static {
        final aqhv a2 = new aqhv();
        ahcz.registerDefaultInstance(aqhv.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 168777401, ahgc.k, aqhv.class);
    }
    
    private aqhv() {
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
                if ((g = aqhv.g) == null) {
                    synchronized (aqhv.class) {
                        if (aqhv.g == null) {
                            aqhv.g = (ahev)new ahcs((ahcz)aqhv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqhv.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhv.a);
            }
            case 3: {
                return new aqhv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhv.a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
