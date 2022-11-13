import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfm extends ahbh implements ahcw
{
    public static final akfm a;
    public static final ahbf b;
    private static volatile ahdd g;
    public int c;
    public String d;
    public String e;
    public boolean f;
    
    static {
        final akfm a2 = new akfm();
        ahbh.registerDefaultInstance((Class)akfm.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 379, ahek.k, (Class)akfm.class);
    }
    
    private akfm() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = akfm.g) == null) {
                    synchronized (akfm.class) {
                        if (akfm.g == null) {
                            akfm.g = (ahdd)new ahba((ahbh)akfm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akfm.a;
            }
            case 4: {
                return new ahaz((ahbh)akfm.a);
            }
            case 3: {
                return new akfm();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002", new Object[] { "c", "d", "e", "f" });
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
