import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhp extends ahcz implements aheo
{
    public static final aqhp a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public float d;
    
    static {
        final aqhp a2 = new aqhp();
        ahcz.registerDefaultInstance(aqhp.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 472454357, ahgc.k, aqhp.class);
    }
    
    private aqhp() {
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
                if ((e = aqhp.e) == null) {
                    synchronized (aqhp.class) {
                        if (aqhp.e == null) {
                            aqhp.e = (ahev)new ahcs((ahcz)aqhp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqhp.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhp.a);
            }
            case 3: {
                return new aqhp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "c", "d" });
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
