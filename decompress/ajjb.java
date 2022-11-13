import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjb extends ahbh implements ahcw
{
    public static final ajjb a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public boolean e;
    
    static {
        final ajjb a2 = new ajjb();
        ahbh.registerDefaultInstance((Class)ajjb.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 244, ahek.k, (Class)ajjb.class);
    }
    
    private ajjb() {
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
                if ((f = ajjb.f) == null) {
                    synchronized (ajjb.class) {
                        if (ajjb.f == null) {
                            ajjb.f = (ahdd)new ahba((ahbh)ajjb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajjb.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjb.a);
            }
            case 3: {
                return new ajjb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "c", "d", "e" });
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
