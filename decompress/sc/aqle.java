import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqle extends ahbh implements ahcw
{
    public static final aqle a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public String d;
    
    static {
        final aqle a2 = new aqle();
        ahbh.registerDefaultInstance((Class)aqle.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 197074932, ahek.k, (Class)aqle.class);
    }
    
    private aqle() {
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
                if ((e = aqle.e) == null) {
                    synchronized (aqle.class) {
                        if (aqle.e == null) {
                            aqle.e = (ahdd)new ahba((ahbh)aqle.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqle.a;
            }
            case 4: {
                return new ahaz((ahbh)aqle.a);
            }
            case 3: {
                return new aqle();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqle.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
