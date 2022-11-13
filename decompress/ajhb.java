import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhb extends ahbh implements ahcw
{
    public static final ajhb a;
    public static final ahbf b;
    private static volatile ahdd d;
    public float c;
    private int e;
    
    static {
        final ajhb a2 = new ajhb();
        ahbh.registerDefaultInstance((Class)ajhb.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqgj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 339295757, ahek.k, (Class)ajhb.class);
    }
    
    private ajhb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajhb.d) == null) {
                    synchronized (ajhb.class) {
                        if (ajhb.d == null) {
                            ajhb.d = (ahdd)new ahba((ahbh)ajhb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajhb.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhb.a);
            }
            case 3: {
                return new ajhb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "e", "c" });
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
