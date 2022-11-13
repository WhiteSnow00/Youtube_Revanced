import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajev extends ahbh implements ahcw
{
    public static final ajev a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajev a2 = new ajev();
        ahbh.registerDefaultInstance((Class)ajev.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 230793507, ahek.k, (Class)ajev.class);
    }
    
    private ajev() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajev.c) == null) {
                    synchronized (ajev.class) {
                        if (ajev.c == null) {
                            ajev.c = (ahdd)new ahba((ahbh)ajev.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajev.a;
            }
            case 4: {
                return new ahaz((ahbh)ajev.a);
            }
            case 3: {
                return new ajev();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajev.a, "\u0001\u0000", (Object[])null);
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
