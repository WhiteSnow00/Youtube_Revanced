import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqf extends ahbh implements ahcw
{
    public static final afqf a;
    private static volatile ahdd d;
    public int b;
    public int c;
    
    static {
        ahbh.registerDefaultInstance((Class)afqf.class, (ahbh)(a = new afqf()));
    }
    
    private afqf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = afqf.d) == null) {
                    synchronized (afqf.class) {
                        if (afqf.d == null) {
                            afqf.d = (ahdd)new ahba((ahbh)afqf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afqf.a;
            }
            case 4: {
                return new ahaz((ahbh)afqf.a);
            }
            case 3: {
                return new afqf();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqf.a, "\u0001\u0000", (Object[])null);
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
