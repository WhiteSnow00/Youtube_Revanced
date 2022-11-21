import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqis extends ahcz implements aheo
{
    public static final aqis a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public int d;
    private int f;
    
    static {
        final aqis a2 = new aqis();
        ahcz.registerDefaultInstance(aqis.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqhw.a, a2, (MessageLite)a2, null, 212323971, ahgc.k, aqis.class);
    }
    
    private aqis() {
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqis.e) == null) {
                    synchronized (aqis.class) {
                        if (aqis.e == null) {
                            aqis.e = (ahev)new ahcs((ahcz)aqis.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqis.a;
            }
            case 4: {
                return new ahcr((ahcz)aqis.a);
            }
            case 3: {
                return new aqis();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqis.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "f", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
