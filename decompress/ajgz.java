import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgz extends ahbh implements ahcw
{
    public static final ajgz a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public int d;
    
    static {
        final ajgz a2 = new ajgz();
        ahbh.registerDefaultInstance((Class)ajgz.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)appk.a, (Object)a2, (MessageLite)a2, (ahbm)null, 393415810, ahek.k, (Class)ajgz.class);
    }
    
    private ajgz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajgz.e) == null) {
                    synchronized (ajgz.class) {
                        if (ajgz.e == null) {
                            ajgz.e = (ahdd)new ahba((ahbh)ajgz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajgz.a;
            }
            case 4: {
                return new ahaz((ahbh)ajgz.a);
            }
            case 3: {
                return new ajgz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", apza.a() });
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
