import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amji extends ahcz implements aheo
{
    public static final amji a;
    private static volatile ahev g;
    public int b;
    public String c;
    public String d;
    public ahdp e;
    public double f;
    
    static {
        ahcz.registerDefaultInstance(amji.class, a = new amji());
    }
    
    private amji() {
        this.c = "";
        this.d = "";
        this.e = ahcz.emptyProtobufList();
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
                if ((g = amji.g) == null) {
                    synchronized (amji.class) {
                        if (amji.g == null) {
                            amji.g = (ahev)new ahcs((ahcz)amji.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amji.a;
            }
            case 4: {
                return new ahcr((ahcz)amji.a);
            }
            case 3: {
                return new amji();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amji.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1000\u0002", new Object[] { "b", "c", "d", "e", amjh.class, "f" });
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
