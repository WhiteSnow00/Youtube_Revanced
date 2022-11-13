import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqe extends ahbh implements ahcw
{
    public static final afqe a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final afqe a2 = new afqe();
        ahbh.registerDefaultInstance((Class)afqe.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)afpt.a, (Object)a2, (MessageLite)a2, (ahbm)null, 118, ahek.k, (Class)afqe.class);
    }
    
    private afqe() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = afqe.c) == null) {
                    synchronized (afqe.class) {
                        if (afqe.c == null) {
                            afqe.c = (ahdd)new ahba((ahbh)afqe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return afqe.a;
            }
            case 4: {
                return new ahaz((ahbh)afqe.a);
            }
            case 3: {
                return new afqe();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqe.a, "\u0001\u0000", (Object[])null);
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
