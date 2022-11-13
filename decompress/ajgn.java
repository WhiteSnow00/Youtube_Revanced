import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgn extends ahbh implements ahcw
{
    public static final ajgn a;
    public static final ahbf b;
    private static volatile ahdd d;
    public String c;
    private int e;
    
    static {
        final ajgn a2 = new ajgn();
        ahbh.registerDefaultInstance((Class)ajgn.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 188662615, ahek.k, (Class)ajgn.class);
    }
    
    private ajgn() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ajgn.d) == null) {
                    synchronized (ajgn.class) {
                        if (ajgn.d == null) {
                            ajgn.d = (ahdd)new ahba((ahbh)ajgn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajgn.a;
            }
            case 4: {
                return new ahaz((ahbh)ajgn.a);
            }
            case 3: {
                return new ajgn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
