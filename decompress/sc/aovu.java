import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovu extends ahbh implements ahcw
{
    public static final aovu a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public boolean d;
    public int e;
    public int f;
    
    static {
        final aovu a2 = new aovu();
        ahbh.registerDefaultInstance((Class)aovu.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 307697168, ahek.k, (Class)aovu.class);
    }
    
    private aovu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aovu.g) == null) {
                    synchronized (aovu.class) {
                        if (aovu.g == null) {
                            aovu.g = (ahdd)new ahba((ahbh)aovu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aovu.a;
            }
            case 4: {
                return new ahaz((ahbh)aovu.a);
            }
            case 3: {
                return new aovu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[] { "c", "d", "e", "f" });
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
