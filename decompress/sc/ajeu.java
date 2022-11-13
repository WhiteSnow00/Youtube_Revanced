import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajeu extends ahbh implements ahcw
{
    public static final ajeu a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajeu a2 = new ajeu();
        ahbh.registerDefaultInstance((Class)ajeu.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 427304386, ahek.k, (Class)ajeu.class);
    }
    
    private ajeu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajeu.c) == null) {
                    synchronized (ajeu.class) {
                        if (ajeu.c == null) {
                            ajeu.c = (ahdd)new ahba((ahbh)ajeu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajeu.a;
            }
            case 4: {
                return new ahaz((ahbh)ajeu.a);
            }
            case 3: {
                return new ajeu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajeu.a, "\u0001\u0000", (Object[])null);
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
