import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqew extends ahbh implements ahcw
{
    public static final aqew a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public aqer d;
    public aqer e;
    public aqgv f;
    
    static {
        final aqew a2 = new aqew();
        ahbh.registerDefaultInstance((Class)aqew.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 461985397, ahek.k, (Class)aqew.class);
    }
    
    private aqew() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqew.g) == null) {
                    synchronized (aqew.class) {
                        if (aqew.g == null) {
                            aqew.g = (ahdd)new ahba((ahbh)aqew.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqew.a;
            }
            case 4: {
                return new ahaz((ahbh)aqew.a);
            }
            case 3: {
                return new aqew();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqew.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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
