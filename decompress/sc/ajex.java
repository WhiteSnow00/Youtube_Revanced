import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajex extends ahbh implements ahcw
{
    public static final ajex a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajex a2 = new ajex();
        ahbh.registerDefaultInstance((Class)ajex.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 221166232, ahek.k, (Class)ajex.class);
    }
    
    private ajex() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajex.c) == null) {
                    synchronized (ajex.class) {
                        if (ajex.c == null) {
                            ajex.c = (ahdd)new ahba((ahbh)ajex.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajex.a;
            }
            case 4: {
                return new ahaz((ahbh)ajex.a);
            }
            case 3: {
                return new ajex();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajex.a, "\u0001\u0000", (Object[])null);
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
