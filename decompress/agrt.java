import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrt extends ahcz implements aheo
{
    public static final agrt a;
    private static volatile ahev d;
    public String b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(agrt.class, a = new agrt());
    }
    
    private agrt() {
        this.b = "";
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
                if ((d = agrt.d) == null) {
                    synchronized (agrt.class) {
                        if (agrt.d == null) {
                            agrt.d = (ahev)new ahcs((ahcz)agrt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agrt.a;
            }
            case 4: {
                return new ahcr((ahcz)agrt.a);
            }
            case 3: {
                return new agrt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrt.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[] { "b", "c" });
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
