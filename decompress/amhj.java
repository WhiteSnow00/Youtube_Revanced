import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhj extends ahcz implements aheo
{
    public static final ahdi a;
    public static final amhj b;
    private static volatile ahev e;
    public ahdh c;
    public ahdp d;
    
    static {
        a = (ahdi)new alxv(2);
        ahcz.registerDefaultInstance(amhj.class, b = new amhj());
    }
    
    private amhj() {
        this.c = ahcz.emptyIntList();
        this.d = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = amhj.e) == null) {
                    synchronized (amhj.class) {
                        if (amhj.e == null) {
                            amhj.e = (ahev)new ahcs((ahcz)amhj.b);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amhj.b;
            }
            case 4: {
                return new ahcr((ahcz)amhj.b);
            }
            case 3: {
                return new amhj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhj.b, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[] { "c", amgj.a(), "d", amhh.class });
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
