import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxr extends ahbh implements ahcw
{
    public static final ajxr a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajxr a2 = new ajxr();
        ahbh.registerDefaultInstance((Class)ajxr.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqgb.a, (Object)a2, (MessageLite)a2, (ahbm)null, 346458202, ahek.k, (Class)ajxr.class);
    }
    
    private ajxr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajxr.c) == null) {
                    synchronized (ajxr.class) {
                        if (ajxr.c == null) {
                            ajxr.c = (ahdd)new ahba((ahbh)ajxr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajxr.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxr.a);
            }
            case 3: {
                return new ajxr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxr.a, "\u0001\u0000", (Object[])null);
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
