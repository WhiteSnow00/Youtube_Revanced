import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfq extends ahbh implements ahcw
{
    public static final akfq a;
    public static final ahbf b;
    private static volatile ahdd i;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public int g;
    public boolean h;
    
    static {
        final akfq a2 = new akfq();
        ahbh.registerDefaultInstance((Class)akfq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 380, ahek.k, (Class)akfq.class);
    }
    
    private akfq() {
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
                final ahdd i;
                if ((i = akfq.i) == null) {
                    synchronized (akfq.class) {
                        if (akfq.i == null) {
                            akfq.i = (ahdd)new ahba((ahbh)akfq.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akfq.a;
            }
            case 4: {
                return new ahaz((ahbh)akfq.a);
            }
            case 3: {
                return new akfq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfq.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u100c\u0003\u0005\u1007\u0004", new Object[] { "c", "d", "e", "f", "g", akfr.a(), "h" });
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
