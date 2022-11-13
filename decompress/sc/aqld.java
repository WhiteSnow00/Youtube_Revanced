import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqld extends ahbh implements ahcw
{
    public static final aqld a;
    public static final ahbf b;
    private static volatile ahdd d;
    public String c;
    private int e;
    
    static {
        final aqld a2 = new aqld();
        ahbh.registerDefaultInstance((Class)aqld.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 315254111, ahek.k, (Class)aqld.class);
    }
    
    private aqld() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqld.d) == null) {
                    synchronized (aqld.class) {
                        if (aqld.d == null) {
                            aqld.d = (ahdd)new ahba((ahbh)aqld.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqld.a;
            }
            case 4: {
                return new ahaz((ahbh)aqld.a);
            }
            case 3: {
                return new aqld();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqld.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
