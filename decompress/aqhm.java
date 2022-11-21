import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhm extends ahcz implements aheo
{
    public static final aqhm a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public aqht d;
    public aqht e;
    public aqht f;
    
    static {
        final aqhm a2 = new aqhm();
        ahcz.registerDefaultInstance(aqhm.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 455145426, ahgc.k, aqhm.class);
    }
    
    private aqhm() {
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
                if ((g = aqhm.g) == null) {
                    synchronized (aqhm.class) {
                        if (aqhm.g == null) {
                            aqhm.g = (ahev)new ahcs((ahcz)aqhm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqhm.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhm.a);
            }
            case 3: {
                return new aqhm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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
