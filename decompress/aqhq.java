import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhq extends ahcz implements aheo
{
    public static final aqhq a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public aqhl d;
    public aqhl e;
    public aqjp f;
    
    static {
        final aqhq a2 = new aqhq();
        ahcz.registerDefaultInstance(aqhq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 461985397, ahgc.k, aqhq.class);
    }
    
    private aqhq() {
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
                if ((g = aqhq.g) == null) {
                    synchronized (aqhq.class) {
                        if (aqhq.g == null) {
                            aqhq.g = (ahev)new ahcs((ahcz)aqhq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqhq.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhq.a);
            }
            case 3: {
                return new aqhq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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
