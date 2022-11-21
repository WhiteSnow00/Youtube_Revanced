import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsy extends ahcz implements aheo
{
    public static final aqsy a;
    private static volatile ahev f;
    public int b;
    public String c;
    public long d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(aqsy.class, a = new aqsy());
    }
    
    private aqsy() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqsy.f) == null) {
                    synchronized (aqsy.class) {
                        if (aqsy.f == null) {
                            aqsy.f = (ahev)new ahcs((ahcz)aqsy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqsy.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsy.a);
            }
            case 3: {
                return new aqsy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
