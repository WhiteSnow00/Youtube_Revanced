import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amla extends ahbh implements ahcw
{
    public static final amla a;
    public static final ahbf b;
    private static volatile ahdd d;
    public ahbx c;
    
    static {
        final amla a2 = new amla();
        ahbh.registerDefaultInstance((Class)amla.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 290993185, ahek.k, (Class)amla.class);
    }
    
    private amla() {
        this.c = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = amla.d) == null) {
                    synchronized (amla.class) {
                        if (amla.d == null) {
                            amla.d = (ahdd)new ahba((ahbh)amla.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amla.a;
            }
            case 4: {
                return new ahaz((ahbh)amla.a);
            }
            case 3: {
                return new amla();
            }
            case 2: {
                return newMessageInfo((MessageLite)amla.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "c" });
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
