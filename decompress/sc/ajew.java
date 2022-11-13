import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajew extends ahbh implements ahcw
{
    public static final ajew a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajew a2 = new ajew();
        ahbh.registerDefaultInstance((Class)ajew.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 234870342, ahek.k, (Class)ajew.class);
    }
    
    private ajew() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajew.c) == null) {
                    synchronized (ajew.class) {
                        if (ajew.c == null) {
                            ajew.c = (ahdd)new ahba((ahbh)ajew.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajew.a;
            }
            case 4: {
                return new ahaz((ahbh)ajew.a);
            }
            case 3: {
                return new ajew();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajew.a, "\u0001\u0000", (Object[])null);
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
