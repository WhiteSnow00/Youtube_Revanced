import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxq extends ahcz implements aheo
{
    public static final akxq a;
    private static volatile ahev e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(akxq.class, a = new akxq());
    }
    
    private akxq() {
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
                if ((e = akxq.e) == null) {
                    synchronized (akxq.class) {
                        if (akxq.e == null) {
                            akxq.e = (ahev)new ahcs((ahcz)akxq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akxq.a;
            }
            case 4: {
                return new ahcr((ahcz)akxq.a);
            }
            case 3: {
                return new akxq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0001", new Object[] { "b", "c", "d" });
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
