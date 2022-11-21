import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agre extends ahcz implements aheo
{
    public static final agre a;
    private static volatile ahev e;
    public agsa b;
    public agrm c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(agre.class, a = new agre());
    }
    
    private agre() {
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
                if ((e = agre.e) == null) {
                    synchronized (agre.class) {
                        if (agre.e == null) {
                            agre.e = (ahev)new ahcs((ahcz)agre.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agre.a;
            }
            case 4: {
                return new ahcr((ahcz)agre.a);
            }
            case 3: {
                return new agre();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agre.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[] { "b", "c", "d" });
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
