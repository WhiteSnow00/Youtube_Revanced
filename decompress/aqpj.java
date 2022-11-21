import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpj extends ahcz implements aheo
{
    public static final aqpj a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public Object d;
    
    static {
        final aqpj a2 = new aqpj();
        ahcz.registerDefaultInstance(aqpj.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), a2, (MessageLite)a2, null, 405866343, ahgc.k, aqpj.class);
    }
    
    private aqpj() {
        this.c = 0;
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
                if ((e = aqpj.e) == null) {
                    synchronized (aqpj.class) {
                        if (aqpj.e == null) {
                            aqpj.e = (ahev)new ahcs((ahcz)aqpj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqpj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpj.a);
            }
            case 3: {
                return new aqpj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpj.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "d", "c", aqpx.class });
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
