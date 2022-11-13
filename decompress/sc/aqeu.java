import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqeu extends ahbh implements ahcw
{
    public static final aqeu a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public float d;
    
    static {
        final aqeu a2 = new aqeu();
        ahbh.registerDefaultInstance((Class)aqeu.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 472454038, ahek.k, (Class)aqeu.class);
    }
    
    private aqeu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqeu.e) == null) {
                    synchronized (aqeu.class) {
                        if (aqeu.e == null) {
                            aqeu.e = (ahdd)new ahba((ahbh)aqeu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqeu.a;
            }
            case 4: {
                return new ahaz((ahbh)aqeu.a);
            }
            case 3: {
                return new aqeu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqeu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "c", "d" });
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
