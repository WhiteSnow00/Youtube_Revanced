import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agux extends ahcz implements aheo
{
    public static final agux a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(agux.class, a = new agux());
    }
    
    private agux() {
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
                if ((d = agux.d) == null) {
                    synchronized (agux.class) {
                        if (agux.d == null) {
                            agux.d = (ahev)new ahcs((ahcz)agux.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agux.a;
            }
            case 4: {
                return new ahcr((ahcz)agux.a);
            }
            case 3: {
                return new agux();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agux.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[] { "b", "c" });
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
