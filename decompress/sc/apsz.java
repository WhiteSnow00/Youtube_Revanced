import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsz extends ahbh implements ahcw
{
    public static final apsz a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public ahcr e;
    
    static {
        final apsz a2 = new apsz();
        ahbh.registerDefaultInstance((Class)apsz.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 413, ahek.k, (Class)apsz.class);
    }
    
    private apsz() {
        this.e = ahcr.a;
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
                if ((f = apsz.f) == null) {
                    synchronized (apsz.class) {
                        if (apsz.f == null) {
                            apsz.f = (ahdd)new ahba((ahbh)apsz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsz.a;
            }
            case 4: {
                return new ahaz((byte[])null, (float[][])null);
            }
            case 3: {
                return new apsz();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1008\u0000\u00022", new Object[] { "c", "d", "e", apsy.a });
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
