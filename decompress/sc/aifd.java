import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifd extends ahbh implements ahcw
{
    public static final aifd a;
    public static final ahbf b;
    public static final ahbf c;
    public static final ahbf d;
    private static volatile ahdd e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifd.class, (ahbh)(a = new aifd()));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiff.a, (Object)aifg.a, (MessageLite)aifg.a, (ahbm)null, 146730964, ahek.k, (Class)aifg.class);
        c = ahbh.newSingularGeneratedExtension((MessageLite)aiff.a, (Object)false, (MessageLite)null, (ahbm)null, 147492108, ahek.h, (Class)Boolean.class);
        d = ahbh.newRepeatedGeneratedExtension((MessageLite)aiff.a, (MessageLite)aifg.a, (ahbm)null, 154861719, ahek.k, false, (Class)aifg.class);
    }
    
    private aifd() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aifd.e) == null) {
                    synchronized (aifd.class) {
                        if (aifd.e == null) {
                            aifd.e = (ahdd)new ahba((ahbh)aifd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aifd.a;
            }
            case 4: {
                return new ahaz((ahbh)aifd.a);
            }
            case 3: {
                return new aifd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifd.a, "\u0001\u0000", (Object[])null);
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
