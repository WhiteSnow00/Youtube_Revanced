import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolc extends ahbh implements ahcw
{
    public static final aolc a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final aolc a2 = new aolc();
        ahbh.registerDefaultInstance((Class)aolc.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 388804096, ahek.k, (Class)aolc.class);
    }
    
    private aolc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aolc.c) == null) {
                    synchronized (aolc.class) {
                        if (aolc.c == null) {
                            aolc.c = (ahdd)new ahba((ahbh)aolc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aolc.a;
            }
            case 4: {
                return new ahaz((ahbh)aolc.a);
            }
            case 3: {
                return new aolc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolc.a, "\u0001\u0000", (Object[])null);
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
