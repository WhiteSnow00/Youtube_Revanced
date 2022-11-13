import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anxe extends ahbh implements ahcw
{
    public static final anxe a;
    public static final ahbf b;
    public static final ahbf c;
    public static final ahbf d;
    public static final ahbf e;
    public static final ahbf f;
    private static volatile ahdd g;
    
    static {
        ahbh.registerDefaultInstance((Class)anxe.class, (ahbh)(a = new anxe()));
        final anxf a2 = anxf.a;
        final Boolean value = false;
        b = ahbh.newSingularGeneratedExtension((MessageLite)a2, (Object)value, (MessageLite)null, (ahbm)null, 307091372, ahek.h, (Class)Boolean.class);
        c = ahbh.newSingularGeneratedExtension((MessageLite)anxf.a, (Object)value, (MessageLite)null, (ahbm)null, 308140915, ahek.h, (Class)Boolean.class);
        final anxf a3 = anxf.a;
        final Integer value2 = 0;
        d = ahbh.newSingularGeneratedExtension((MessageLite)a3, (Object)value2, (MessageLite)null, (ahbm)null, 320664538, ahek.e, (Class)Integer.class);
        e = ahbh.newSingularGeneratedExtension((MessageLite)anxf.a, (Object)value2, (MessageLite)null, (ahbm)null, 338678567, ahek.e, (Class)Integer.class);
        f = ahbh.newSingularGeneratedExtension((MessageLite)anxf.a, (Object)value, (MessageLite)null, (ahbm)null, 475416448, ahek.h, (Class)Boolean.class);
    }
    
    private anxe() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = anxe.g) == null) {
                    synchronized (anxe.class) {
                        if (anxe.g == null) {
                            anxe.g = (ahdd)new ahba((ahbh)anxe.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anxe.a;
            }
            case 4: {
                return new ahaz((ahbh)anxe.a);
            }
            case 3: {
                return new anxe();
            }
            case 2: {
                return newMessageInfo((MessageLite)anxe.a, "\u0001\u0000", (Object[])null);
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
