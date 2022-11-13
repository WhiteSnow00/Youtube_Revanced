import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfa extends ahbh implements ahcw
{
    public static final ajfa a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajfa a2 = new ajfa();
        ahbh.registerDefaultInstance((Class)ajfa.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 206634270, ahek.k, (Class)ajfa.class);
    }
    
    private ajfa() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajfa.c) == null) {
                    synchronized (ajfa.class) {
                        if (ajfa.c == null) {
                            ajfa.c = (ahdd)new ahba((ahbh)ajfa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajfa.a;
            }
            case 4: {
                return new ahaz((ahbh)ajfa.a);
            }
            case 3: {
                return new ajfa();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajfa.a, "\u0001\u0000", (Object[])null);
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
