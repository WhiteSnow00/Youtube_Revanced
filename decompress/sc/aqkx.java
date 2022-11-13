import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkx extends ahbh implements ahcw
{
    public static final aqkx a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public int d;
    
    static {
        final aqkx a2 = new aqkx();
        ahbh.registerDefaultInstance((Class)aqkx.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 329240327, ahek.k, (Class)aqkx.class);
    }
    
    private aqkx() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqkx.e) == null) {
                    synchronized (aqkx.class) {
                        if (aqkx.e == null) {
                            aqkx.e = (ahdd)new ahba((ahbh)aqkx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqkx.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkx.a);
            }
            case 3: {
                return new aqkx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", aqky.a() });
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
