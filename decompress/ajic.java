import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajic extends ahbh implements ahcw
{
    public static final ajic a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public int d;
    
    static {
        final ajic a2 = new ajic();
        ahbh.registerDefaultInstance((Class)ajic.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)appk.a, (Object)a2, (MessageLite)a2, (ahbm)null, 337527695, ahek.k, (Class)ajic.class);
    }
    
    private ajic() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajic.e) == null) {
                    synchronized (ajic.class) {
                        if (ajic.e == null) {
                            ajic.e = (ahdd)new ahba((ahbh)ajic.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajic.a;
            }
            case 4: {
                return new ahaz((ahbh)ajic.a);
            }
            case 3: {
                return new ajic();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajic.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", apza.a() });
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
