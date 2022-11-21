import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhh extends ahcz implements aheo
{
    public static final aqhh a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public aqjp d;
    public int e;
    
    static {
        final aqhh a2 = new aqhh();
        ahcz.registerDefaultInstance(aqhh.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 198239242, ahgc.k, aqhh.class);
    }
    
    private aqhh() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqhh.f) == null) {
                    synchronized (aqhh.class) {
                        if (aqhh.f == null) {
                            aqhh.f = (ahev)new ahcs((ahcz)aqhh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqhh.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhh.a);
            }
            case 3: {
                return new aqhh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001", new Object[] { "c", "d", "e" });
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
