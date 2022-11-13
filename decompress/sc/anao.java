import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anao extends ahbh implements ahcw
{
    public static final anao a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final anao a2 = new anao();
        ahbh.registerDefaultInstance((Class)anao.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 377026399, ahek.k, (Class)anao.class);
    }
    
    private anao() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = anao.c) == null) {
                    synchronized (anao.class) {
                        if (anao.c == null) {
                            anao.c = (ahdd)new ahba((ahbh)anao.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anao.a;
            }
            case 4: {
                return new ahaz((ahbh)anao.a);
            }
            case 3: {
                return new anao();
            }
            case 2: {
                return newMessageInfo((MessageLite)anao.a, "\u0001\u0000", (Object[])null);
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
