import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqim extends ahcz implements aheo
{
    public static final aqim a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public int d;
    public int e;
    
    static {
        final aqim a2 = new aqim();
        ahcz.registerDefaultInstance(aqim.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 449848976, ahgc.k, aqim.class);
    }
    
    private aqim() {
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
                if ((f = aqim.f) == null) {
                    synchronized (aqim.class) {
                        if (aqim.f == null) {
                            aqim.f = (ahev)new ahcs((ahcz)aqim.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqim.a;
            }
            case 4: {
                return new ahcr((ahcz)aqim.a);
            }
            case 3: {
                return new aqim();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqim.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "c", "d", "e" });
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
