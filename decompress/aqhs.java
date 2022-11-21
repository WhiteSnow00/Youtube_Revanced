import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhs extends ahcz implements aheo
{
    public static final aqhs a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public aqhr d;
    
    static {
        final aqhs a2 = new aqhs();
        ahcz.registerDefaultInstance(aqhs.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 409052762, ahgc.k, aqhs.class);
    }
    
    private aqhs() {
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
                if ((e = aqhs.e) == null) {
                    synchronized (aqhs.class) {
                        if (aqhs.e == null) {
                            aqhs.e = (ahev)new ahcs((ahcz)aqhs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqhs.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhs.a);
            }
            case 3: {
                return new aqhs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhs.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
