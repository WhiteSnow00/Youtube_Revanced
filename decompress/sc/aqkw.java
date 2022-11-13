import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkw extends ahbh implements ahcw
{
    public static final aqkw a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public float e;
    
    static {
        final aqkw a2 = new aqkw();
        ahbh.registerDefaultInstance((Class)aqkw.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 455760611, ahek.k, (Class)aqkw.class);
    }
    
    private aqkw() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqkw.f) == null) {
                    synchronized (aqkw.class) {
                        if (aqkw.f == null) {
                            aqkw.f = (ahdd)new ahba((ahbh)aqkw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqkw.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkw.a);
            }
            case 3: {
                return new aqkw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1001\u0001", new Object[] { "c", "d", "e" });
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
