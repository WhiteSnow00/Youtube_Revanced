import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqe extends ahcz implements aheo
{
    public static final agqe a;
    private static volatile ahev e;
    public int b;
    public double c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(agqe.class, a = new agqe());
    }
    
    private agqe() {
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
                if ((e = agqe.e) == null) {
                    synchronized (agqe.class) {
                        if (agqe.e == null) {
                            agqe.e = (ahev)new ahcs((ahcz)agqe.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqe.a;
            }
            case 4: {
                return new ahcr((ahcz)agqe.a);
            }
            case 3: {
                return new agqe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqe.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
