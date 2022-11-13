import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqku extends ahbh implements ahcw
{
    public static final aqku a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final aqku a2 = new aqku();
        ahbh.registerDefaultInstance((Class)aqku.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 336926123, ahek.k, (Class)aqku.class);
    }
    
    private aqku() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqku.c) == null) {
                    synchronized (aqku.class) {
                        if (aqku.c == null) {
                            aqku.c = (ahdd)new ahba((ahbh)aqku.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqku.a;
            }
            case 4: {
                return new ahaz((ahbh)aqku.a);
            }
            case 3: {
                return new aqku();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqku.a, "\u0001\u0000", (Object[])null);
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
