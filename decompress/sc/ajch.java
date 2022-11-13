import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajch extends ahbh implements ahcw
{
    public static final ajch a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public int d;
    public Object e;
    public String f;
    
    static {
        final ajch a2 = new ajch();
        ahbh.registerDefaultInstance((Class)ajch.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 303, ahek.k, (Class)ajch.class);
    }
    
    private ajch() {
        this.d = 0;
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
                if ((g = ajch.g) == null) {
                    synchronized (ajch.class) {
                        if (ajch.g == null) {
                            ajch.g = (ahdd)new ahba((ahbh)ajch.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajch.a;
            }
            case 4: {
                return new ahaz((ahbh)ajch.a);
            }
            case 3: {
                return new ajch();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajch.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1037\u0000\u0003\u103f\u0000", new Object[] { "e", "d", "c", "f", apoc.a() });
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
