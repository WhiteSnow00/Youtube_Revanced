import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqop extends ahcz implements aheo
{
    public static final aqop a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahbt d;
    
    static {
        ahcz.registerDefaultInstance(aqop.class, a = new aqop());
    }
    
    private aqop() {
        this.c = "";
        this.d = ahbt.b;
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
                if ((e = aqop.e) == null) {
                    synchronized (aqop.class) {
                        if (aqop.e == null) {
                            aqop.e = (ahev)new ahcs((ahcz)aqop.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqop.a;
            }
            case 4: {
                return new ahcr((ahcz)aqop.a);
            }
            case 3: {
                return new aqop();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqop.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
