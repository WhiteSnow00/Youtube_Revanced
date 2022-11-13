import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqkt extends ahbh implements ahcw
{
    public static final aqkt a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public String d;
    
    static {
        final aqkt a2 = new aqkt();
        ahbh.registerDefaultInstance((Class)aqkt.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 360463768, ahek.k, (Class)aqkt.class);
    }
    
    private aqkt() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqkt.e) == null) {
                    synchronized (aqkt.class) {
                        if (aqkt.e == null) {
                            aqkt.e = (ahdd)new ahba((ahbh)aqkt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqkt.a;
            }
            case 4: {
                return new ahaz((ahbh)aqkt.a);
            }
            case 3: {
                return new aqkt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqkt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
