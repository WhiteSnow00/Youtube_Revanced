import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anan extends ahbh implements ahcw
{
    public static final anan a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final anan a2 = new anan();
        ahbh.registerDefaultInstance((Class)anan.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 377026217, ahek.k, (Class)anan.class);
    }
    
    private anan() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anan.c) == null) {
                    synchronized (anan.class) {
                        if (anan.c == null) {
                            anan.c = (ahdd)new ahba((ahbh)anan.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anan.a;
            }
            case 4: {
                return new ahaz((ahbh)anan.a);
            }
            case 3: {
                return new anan();
            }
            case 2: {
                return newMessageInfo((MessageLite)anan.a, "\u0001\u0000", (Object[])null);
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
