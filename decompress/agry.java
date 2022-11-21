import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agry extends ahcz implements aheo
{
    public static final agry a;
    private static volatile ahev e;
    public agsa b;
    public String c;
    public agrb d;
    
    static {
        ahcz.registerDefaultInstance(agry.class, a = new agry());
    }
    
    private agry() {
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
                final ahev e;
                if ((e = agry.e) == null) {
                    synchronized (agry.class) {
                        if (agry.e == null) {
                            agry.e = (ahev)new ahcs((ahcz)agry.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agry.a;
            }
            case 4: {
                return new ahcr((ahcz)agry.a);
            }
            case 3: {
                return new agry();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agry.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t", new Object[] { "b", "c", "d" });
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
