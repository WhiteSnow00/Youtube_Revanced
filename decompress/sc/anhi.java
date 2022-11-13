import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhi extends ahbh implements ahcw
{
    public static final anhi a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public String d;
    public int e;
    public int f;
    
    static {
        final anhi a2 = new anhi();
        ahbh.registerDefaultInstance((Class)anhi.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 323, ahek.k, (Class)anhi.class);
    }
    
    private anhi() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = anhi.g) == null) {
                    synchronized (anhi.class) {
                        if (anhi.g == null) {
                            anhi.g = (ahdd)new ahba((ahbh)anhi.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anhi.a;
            }
            case 4: {
                return new ahaz((ahbh)anhi.a);
            }
            case 3: {
                return new anhi();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhi.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "c", "d", "e", anhk.a(), "f", anhj.a() });
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
