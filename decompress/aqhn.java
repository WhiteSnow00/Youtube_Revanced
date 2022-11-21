import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhn extends ahcz implements aheo
{
    public static final aqhn a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public aqhl d;
    public aqhl e;
    public aqjp f;
    
    static {
        final aqhn a2 = new aqhn();
        ahcz.registerDefaultInstance(aqhn.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 463642931, ahgc.k, aqhn.class);
    }
    
    private aqhn() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aqhn.g) == null) {
                    synchronized (aqhn.class) {
                        if (aqhn.g == null) {
                            aqhn.g = (ahev)new ahcs((ahcz)aqhn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqhn.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhn.a);
            }
            case 3: {
                return new aqhn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhn.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0004\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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
