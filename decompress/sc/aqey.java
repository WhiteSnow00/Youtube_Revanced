import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqey extends ahbh implements ahcw
{
    public static final aqey a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public aqex d;
    
    static {
        final aqey a2 = new aqey();
        ahbh.registerDefaultInstance((Class)aqey.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 409052762, ahek.k, (Class)aqey.class);
    }
    
    private aqey() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqey.e) == null) {
                    synchronized (aqey.class) {
                        if (aqey.e == null) {
                            aqey.e = (ahdd)new ahba((ahbh)aqey.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqey.a;
            }
            case 4: {
                return new ahaz((ahbh)aqey.a);
            }
            case 3: {
                return new aqey();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqey.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
