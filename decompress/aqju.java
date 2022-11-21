import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqju extends ahcz implements aheo
{
    public static final aqju a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public aqjp d;
    public aqjz e;
    public float f;
    
    static {
        final aqju a2 = new aqju();
        ahcz.registerDefaultInstance(aqju.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 193804845, ahgc.k, aqju.class);
    }
    
    private aqju() {
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
                if ((g = aqju.g) == null) {
                    synchronized (aqju.class) {
                        if (aqju.g == null) {
                            aqju.g = (ahev)new ahcs((ahcz)aqju.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqju.a;
            }
            case 4: {
                return new ahcr((ahcz)aqju.a);
            }
            case 3: {
                return new aqju();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqju.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1001\u0002", new Object[] { "c", "d", "e", "f" });
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
