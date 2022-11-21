import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aloo extends ahcz implements aheo
{
    public static final aloo a;
    private static volatile ahev g;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(aloo.class, a = new aloo());
    }
    
    private aloo() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aloo.g) == null) {
                    synchronized (aloo.class) {
                        if (aloo.g == null) {
                            aloo.g = (ahev)new ahcs((ahcz)aloo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aloo.a;
            }
            case 4: {
                return new ahcr((ahcz)aloo.a);
            }
            case 3: {
                return new aloo();
            }
            case 2: {
                final ahdf u = alfq.u;
                return ahcz.newMessageInfo((MessageLite)aloo.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "b", "c", "d", "e", u, "f", u });
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
