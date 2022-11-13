import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqg extends ahbh implements ahcw
{
    public static final afqg a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public afqf d;
    
    static {
        final afqg a2 = new afqg();
        ahbh.registerDefaultInstance((Class)afqg.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)afqi.a, (Object)a2, (MessageLite)a2, (ahbm)null, 571, ahek.k, (Class)afqg.class);
    }
    
    private afqg() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = afqg.e) == null) {
                    synchronized (afqg.class) {
                        if (afqg.e == null) {
                            afqg.e = (ahdd)new ahba((ahbh)afqg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return afqg.a;
            }
            case 4: {
                return new ahaz((ahbh)afqg.a);
            }
            case 3: {
                return new afqg();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqg.a, "\u0001\u0000", (Object[])null);
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
