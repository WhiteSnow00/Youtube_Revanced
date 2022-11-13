import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqet extends ahbh implements ahcw
{
    public static final aqet a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public aqer d;
    public aqer e;
    public aqgv f;
    
    static {
        final aqet a2 = new aqet();
        ahbh.registerDefaultInstance((Class)aqet.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 463642931, ahek.k, (Class)aqet.class);
    }
    
    private aqet() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqet.g) == null) {
                    synchronized (aqet.class) {
                        if (aqet.g == null) {
                            aqet.g = (ahdd)new ahba((ahbh)aqet.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqet.a;
            }
            case 4: {
                return new ahaz((ahbh)aqet.a);
            }
            case 3: {
                return new aqet();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqet.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0004\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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
