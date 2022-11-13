import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjr extends ahbh implements ahcw
{
    public static final ajjr a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public long d;
    public ajjy e;
    public boolean f;
    
    static {
        final ajjr a2 = new ajjr();
        ahbh.registerDefaultInstance((Class)ajjr.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)amuj.b, (Object)a2, (MessageLite)a2, (ahbm)null, 288486286, ahek.k, (Class)ajjr.class);
    }
    
    private ajjr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajjr.g) == null) {
                    synchronized (ajjr.class) {
                        if (ajjr.g == null) {
                            ajjr.g = (ahdd)new ahba((ahbh)ajjr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajjr.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjr.a);
            }
            case 3: {
                return new ajjr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjr.a, "\u0001\u0003\u0000\u0001\u0005\t\u0003\u0000\u0000\u0000\u0005\u1002\u0003\b\u1009\u0006\t\u1007\u0007", new Object[] { "c", "d", "e", "f" });
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
