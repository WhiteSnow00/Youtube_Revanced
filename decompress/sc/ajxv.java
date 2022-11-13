import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxv extends ahbh implements ahcw
{
    public static final ajxv a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajxv a2 = new ajxv();
        ahbh.registerDefaultInstance((Class)ajxv.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqgb.a, (Object)a2, (MessageLite)a2, (ahbm)null, 346458203, ahek.k, (Class)ajxv.class);
    }
    
    private ajxv() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajxv.c) == null) {
                    synchronized (ajxv.class) {
                        if (ajxv.c == null) {
                            ajxv.c = (ahdd)new ahba((ahbh)ajxv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajxv.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxv.a);
            }
            case 3: {
                return new ajxv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxv.a, "\u0001\u0000", (Object[])null);
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
