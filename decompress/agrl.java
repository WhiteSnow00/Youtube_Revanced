import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrl extends ahcz implements aheo
{
    public static final agrl a;
    private static volatile ahev d;
    public String b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(agrl.class, a = new agrl());
    }
    
    private agrl() {
        this.b = "";
        this.c = "";
        final ahbt b = ahbt.b;
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
                if ((d = agrl.d) == null) {
                    synchronized (agrl.class) {
                        if (agrl.d == null) {
                            agrl.d = (ahev)new ahcs((ahcz)agrl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrl.a;
            }
            case 4: {
                return new ahcr((ahcz)agrl.a);
            }
            case 3: {
                return new agrl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrl.a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0208\u0003\u0208", new Object[] { "b", "c" });
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
