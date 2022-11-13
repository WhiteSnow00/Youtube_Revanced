import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajit extends ahbh implements ahcw
{
    public static final ajit a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public String d;
    public String e;
    public String f;
    
    static {
        final ajit a2 = new ajit();
        ahbh.registerDefaultInstance((Class)ajit.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 301, ahek.k, (Class)ajit.class);
    }
    
    private ajit() {
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajit.g) == null) {
                    synchronized (ajit.class) {
                        if (ajit.g == null) {
                            ajit.g = (ahdd)new ahba((ahbh)ajit.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajit.a;
            }
            case 4: {
                return new ahaz((ahbh)ajit.a);
            }
            case 3: {
                return new ajit();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajit.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
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
