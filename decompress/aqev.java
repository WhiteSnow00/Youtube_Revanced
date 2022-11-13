import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqev extends ahbh implements ahcw
{
    public static final aqev a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public float d;
    
    static {
        final aqev a2 = new aqev();
        ahbh.registerDefaultInstance((Class)aqev.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 472454357, ahek.k, (Class)aqev.class);
    }
    
    private aqev() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqev.e) == null) {
                    synchronized (aqev.class) {
                        if (aqev.e == null) {
                            aqev.e = (ahdd)new ahba((ahbh)aqev.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqev.a;
            }
            case 4: {
                return new ahaz((ahbh)aqev.a);
            }
            case 3: {
                return new aqev();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqev.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "c", "d" });
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
