import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjl extends ahbh implements ahcw
{
    public static final ajjl a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public ajht e;
    private byte g;
    
    static {
        final ajjl a2 = new ajjl();
        ahbh.registerDefaultInstance((Class)ajjl.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 264, ahek.k, (Class)ajjl.class);
    }
    
    private ajjl() {
        this.g = 2;
        this.d = "";
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajjl.f) == null) {
                    synchronized (ajjl.class) {
                        if (ajjl.f == null) {
                            ajjl.f = (ahdd)new ahba((ahbh)ajjl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajjl.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjl.a);
            }
            case 3: {
                return new ajjl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjl.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
