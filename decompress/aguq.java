import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguq extends ahcz implements aheo
{
    public static final aguq a;
    private static volatile ahev e;
    public int b;
    public int c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(aguq.class, a = new aguq());
    }
    
    private aguq() {
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
                if ((e = aguq.e) == null) {
                    synchronized (aguq.class) {
                        if (aguq.e == null) {
                            aguq.e = (ahev)new ahcs((ahcz)aguq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aguq.a;
            }
            case 4: {
                return new ahcr((ahcz)aguq.a);
            }
            case 3: {
                return new aguq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aguq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "b", "c", aqnr.q, "d" });
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
