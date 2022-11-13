import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohn extends ahbh implements ahcw
{
    public static final aohn a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        ahbh.registerDefaultInstance((Class)aohn.class, (ahbh)(a = new aohn()));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ahnv.a, (Object)false, (MessageLite)null, (ahbm)null, 120958174, ahek.h, (Class)Boolean.class);
    }
    
    private aohn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aohn.c) == null) {
                    synchronized (aohn.class) {
                        if (aohn.c == null) {
                            aohn.c = (ahdd)new ahba((ahbh)aohn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aohn.a;
            }
            case 4: {
                return new ahaz((ahbh)aohn.a);
            }
            case 3: {
                return new aohn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohn.a, "\u0001\u0000", (Object[])null);
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
