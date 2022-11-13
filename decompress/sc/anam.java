import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anam extends ahbh implements ahcw
{
    public static final anam a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final anam a2 = new anam();
        ahbh.registerDefaultInstance((Class)anam.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 376887195, ahek.k, (Class)anam.class);
    }
    
    private anam() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anam.c) == null) {
                    synchronized (anam.class) {
                        if (anam.c == null) {
                            anam.c = (ahdd)new ahba((ahbh)anam.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anam.a;
            }
            case 4: {
                return new ahaz((ahbh)anam.a);
            }
            case 3: {
                return new anam();
            }
            case 2: {
                return newMessageInfo((MessageLite)anam.a, "\u0001\u0000", (Object[])null);
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
