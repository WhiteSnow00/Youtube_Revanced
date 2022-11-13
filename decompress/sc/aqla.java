import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqla extends ahbh implements ahcw
{
    public static final aqla a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public String d;
    
    static {
        final aqla a2 = new aqla();
        ahbh.registerDefaultInstance((Class)aqla.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 455760642, ahek.k, (Class)aqla.class);
    }
    
    private aqla() {
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
                if ((e = aqla.e) == null) {
                    synchronized (aqla.class) {
                        if (aqla.e == null) {
                            aqla.e = (ahdd)new ahba((ahbh)aqla.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqla.a;
            }
            case 4: {
                return new ahaz((ahbh)aqla.a);
            }
            case 3: {
                return new aqla();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqla.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
