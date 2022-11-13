import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqen extends ahbh implements ahcw
{
    public static final aqen a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public aqgv d;
    public int e;
    
    static {
        final aqen a2 = new aqen();
        ahbh.registerDefaultInstance((Class)aqen.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 198239242, ahek.k, (Class)aqen.class);
    }
    
    private aqen() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqen.f) == null) {
                    synchronized (aqen.class) {
                        if (aqen.f == null) {
                            aqen.f = (ahdd)new ahba((ahbh)aqen.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqen.a;
            }
            case 4: {
                return new ahaz((ahbh)aqen.a);
            }
            case 3: {
                return new aqen();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqen.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001", new Object[] { "c", "d", "e" });
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
