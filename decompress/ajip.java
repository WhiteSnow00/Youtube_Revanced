import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajip extends ahbh implements ahcw
{
    public static final ajip a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public ahab e;
    
    static {
        final ajip a2 = new ajip();
        ahbh.registerDefaultInstance((Class)ajip.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 299, ahek.k, (Class)ajip.class);
    }
    
    private ajip() {
        this.d = "";
        final ahab b = ahab.b;
        this.e = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajip.f) == null) {
                    synchronized (ajip.class) {
                        if (ajip.f == null) {
                            ajip.f = (ahdd)new ahba((ahbh)ajip.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajip.a;
            }
            case 4: {
                return new ahaz((ahbh)ajip.a);
            }
            case 3: {
                return new ajip();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajip.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u100a\u0002", new Object[] { "c", "d", "e" });
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
