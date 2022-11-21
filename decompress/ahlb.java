import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlb extends ahcz implements aheo
{
    public static final ahlb a;
    private static volatile ahev f;
    public int b;
    public int c;
    public int d;
    public ahxw e;
    
    static {
        ahcz.registerDefaultInstance(ahlb.class, a = new ahlb());
    }
    
    private ahlb() {
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
                if ((f = ahlb.f) == null) {
                    synchronized (ahlb.class) {
                        if (ahlb.f == null) {
                            ahlb.f = (ahev)new ahcs((ahcz)ahlb.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahlb.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlb.a);
            }
            case 3: {
                return new ahlb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlb.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0004\u1009\u0003", new Object[] { "b", "c", ahhs.u, "d", ahhs.t, "e" });
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
