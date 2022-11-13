import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoft extends ahbh implements ahcw
{
    public static final aoft a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final aoft a2 = new aoft();
        ahbh.registerDefaultInstance((Class)aoft.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 448353930, ahek.k, (Class)aoft.class);
    }
    
    private aoft() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aoft.c) == null) {
                    synchronized (aoft.class) {
                        if (aoft.c == null) {
                            aoft.c = (ahdd)new ahba((ahbh)aoft.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoft.a;
            }
            case 4: {
                return new ahaz((ahbh)aoft.a);
            }
            case 3: {
                return new aoft();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoft.a, "\u0001\u0000", (Object[])null);
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
