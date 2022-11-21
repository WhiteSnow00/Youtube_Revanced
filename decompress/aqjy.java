import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjy extends ahcz implements aheo
{
    public static final aqjy a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    
    static {
        final aqjy a2 = new aqjy();
        ahcz.registerDefaultInstance(aqjy.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqjq.a, a2, (MessageLite)a2, null, 200077771, ahgc.k, aqjy.class);
    }
    
    private aqjy() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aqjy.h) == null) {
                    synchronized (aqjy.class) {
                        if (aqjy.h == null) {
                            aqjy.h = (ahev)new ahcs((ahcz)aqjy.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqjy.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjy.a);
            }
            case 3: {
                return new aqjy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjy.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
