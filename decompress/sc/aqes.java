import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqes extends ahbh implements ahcw
{
    public static final aqes a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public aqez d;
    public aqez e;
    public aqez f;
    
    static {
        final aqes a2 = new aqes();
        ahbh.registerDefaultInstance((Class)aqes.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 455145426, ahek.k, (Class)aqes.class);
    }
    
    private aqes() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aqes.g) == null) {
                    synchronized (aqes.class) {
                        if (aqes.g == null) {
                            aqes.g = (ahdd)new ahba((ahbh)aqes.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqes.a;
            }
            case 4: {
                return new ahaz((ahbh)aqes.a);
            }
            case 3: {
                return new aqes();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqes.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "c", "d", "e", "f" });
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
