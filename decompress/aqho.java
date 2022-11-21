import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqho extends ahcz implements aheo
{
    public static final aqho a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public float d;
    
    static {
        final aqho a2 = new aqho();
        ahcz.registerDefaultInstance(aqho.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 472454038, ahgc.k, aqho.class);
    }
    
    private aqho() {
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
                if ((e = aqho.e) == null) {
                    synchronized (aqho.class) {
                        if (aqho.e == null) {
                            aqho.e = (ahev)new ahcs((ahcz)aqho.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqho.a;
            }
            case 4: {
                return new ahcr((ahcz)aqho.a);
            }
            case 3: {
                return new aqho();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqho.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "c", "d" });
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
