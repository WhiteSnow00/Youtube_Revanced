import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmq extends ahbh implements ahcw
{
    public static final aqmq a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public Object d;
    
    static {
        final aqmq a2 = new aqmq();
        ahbh.registerDefaultInstance((Class)aqmq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)SenderStateOuterClass$SenderState.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 405866343, ahek.k, (Class)aqmq.class);
    }
    
    private aqmq() {
        this.c = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqmq.e) == null) {
                    synchronized (aqmq.class) {
                        if (aqmq.e == null) {
                            aqmq.e = (ahdd)new ahba((ahbh)aqmq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqmq.a;
            }
            case 4: {
                return new ahaz((ahbh)aqmq.a);
            }
            case 3: {
                return new aqmq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmq.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "d", "c", aqne.class });
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
