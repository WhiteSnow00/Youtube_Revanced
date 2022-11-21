import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsd extends ahcz implements aheo
{
    public static final agsd a;
    private static volatile ahev d;
    public agsa b;
    public agrm c;
    
    static {
        ahcz.registerDefaultInstance(agsd.class, a = new agsd());
    }
    
    private agsd() {
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
                if ((d = agsd.d) == null) {
                    synchronized (agsd.class) {
                        if (agsd.d == null) {
                            agsd.d = (ahev)new ahcs((ahcz)agsd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agsd.a;
            }
            case 4: {
                return new ahcr((ahcz)agsd.a);
            }
            case 3: {
                return new agsd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsd.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "b", "c" });
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
