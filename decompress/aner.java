import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aner extends ahbh implements ahcw
{
    public static final aner a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public int e;
    
    static {
        final aner a2 = new aner();
        ahbh.registerDefaultInstance((Class)aner.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 344, ahek.k, (Class)aner.class);
    }
    
    private aner() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aner.f) == null) {
                    synchronized (aner.class) {
                        if (aner.f == null) {
                            aner.f = (ahdd)new ahba((ahbh)aner.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aner.a;
            }
            case 4: {
                return new ahaz((ahbh)aner.a);
            }
            case 3: {
                return new aner();
            }
            case 2: {
                return newMessageInfo((MessageLite)aner.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "c", "d", "e", anes.a() });
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
