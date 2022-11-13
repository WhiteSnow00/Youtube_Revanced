import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyb extends ahbh implements ahcw
{
    public static final ajyb a;
    public static final ahbf b;
    private static volatile ahdd d;
    public ahbx c;
    
    static {
        final ajyb a2 = new ajyb();
        ahbh.registerDefaultInstance((Class)ajyb.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 409926433, ahek.k, (Class)ajyb.class);
    }
    
    private ajyb() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajyb.d) == null) {
                    synchronized (ajyb.class) {
                        if (ajyb.d == null) {
                            ajyb.d = (ahdd)new ahba((ahbh)ajyb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajyb.a;
            }
            case 4: {
                return new ahaz((ahbh)ajyb.a);
            }
            case 3: {
                return new ajyb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajyb.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "c", aphx.class });
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
