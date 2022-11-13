import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdq extends ahbh implements ahcw
{
    public static final aqdq a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public boolean d;
    public float e;
    
    static {
        final aqdq a2 = new aqdq();
        ahbh.registerDefaultInstance((Class)aqdq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 196573526, ahek.k, (Class)aqdq.class);
    }
    
    private aqdq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqdq.f) == null) {
                    synchronized (aqdq.class) {
                        if (aqdq.f == null) {
                            aqdq.f = (ahdd)new ahba((ahbh)aqdq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqdq.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdq.a);
            }
            case 3: {
                return new aqdq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1001\u0001", new Object[] { "c", "d", "e" });
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
