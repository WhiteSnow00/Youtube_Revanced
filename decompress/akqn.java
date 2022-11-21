import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqn extends ahcz implements aheo
{
    public static final akqn a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(akqn.class, a = new akqn());
    }
    
    private akqn() {
        this.e = "";
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
                if ((f = akqn.f) == null) {
                    synchronized (akqn.class) {
                        if (akqn.f == null) {
                            akqn.f = (ahev)new ahcs((ahcz)akqn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akqn.a;
            }
            case 4: {
                return new ahcr((ahcz)akqn.a);
            }
            case 3: {
                return new akqn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqn.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
