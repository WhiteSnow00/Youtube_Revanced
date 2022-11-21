import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguh extends ahcz implements aheo
{
    public static final aguh a;
    private static volatile ahev e;
    public int b;
    public int c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(aguh.class, a = new aguh());
    }
    
    private aguh() {
        this.d = 1L;
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
                if ((e = aguh.e) == null) {
                    synchronized (aguh.class) {
                        if (aguh.e == null) {
                            aguh.e = (ahev)new ahcs((ahcz)aguh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aguh.a;
            }
            case 4: {
                return new ahcr((ahcz)aguh.a);
            }
            case 3: {
                return new aguh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aguh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "b", "c", aqyl.a, "d" });
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
