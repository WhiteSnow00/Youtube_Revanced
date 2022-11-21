import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agty extends ahcz implements aheo
{
    public static final agty a;
    private static volatile ahev e;
    public int b;
    public agtx c;
    public agtz d;
    
    static {
        ahcz.registerDefaultInstance(agty.class, a = new agty());
    }
    
    private agty() {
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
                if ((e = agty.e) == null) {
                    synchronized (agty.class) {
                        if (agty.e == null) {
                            agty.e = (ahev)new ahcs((ahcz)agty.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agty.a;
            }
            case 4: {
                return new ahcr((ahcz)agty.a);
            }
            case 3: {
                return new agty();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agty.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
