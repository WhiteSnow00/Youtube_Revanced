import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnq extends ahcz implements aheo
{
    public static final ahnq a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    
    static {
        ahcz.registerDefaultInstance(ahnq.class, a = new ahnq());
    }
    
    private ahnq() {
        this.f = "";
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
                final ahev g;
                if ((g = ahnq.g) == null) {
                    synchronized (ahnq.class) {
                        if (ahnq.g == null) {
                            ahnq.g = (ahev)new ahcs((ahcz)ahnq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahnq.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnq.a);
            }
            case 3: {
                return new ahnq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnq.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0005\u1008\u0004", new Object[] { "b", "c", akgi.o, "d", akgi.p, "e", akgi.q, "f" });
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
