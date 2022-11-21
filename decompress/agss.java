import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agss extends ahcz implements aheo
{
    public static final agss a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(agss.class, a = new agss());
    }
    
    private agss() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = agss.d) == null) {
                    synchronized (agss.class) {
                        if (agss.d == null) {
                            agss.d = (ahev)new ahcs((ahcz)agss.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agss.a;
            }
            case 4: {
                return new ahcr((ahcz)agss.a);
            }
            case 3: {
                return new agss();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agss.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
