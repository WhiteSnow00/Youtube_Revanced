import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtx extends ahcz implements aheo
{
    public static final agtx a;
    private static volatile ahev f;
    public int b;
    public int c;
    public agut d;
    public aguf e;
    
    static {
        ahcz.registerDefaultInstance(agtx.class, a = new agtx());
    }
    
    private agtx() {
        this.c = 5;
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
                if ((f = agtx.f) == null) {
                    synchronized (agtx.class) {
                        if (agtx.f == null) {
                            agtx.f = (ahev)new ahcs((ahcz)agtx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agtx.a;
            }
            case 4: {
                return new ahcr((ahcz)agtx.a);
            }
            case 3: {
                return new agtx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", afsd.k, "d", "e" });
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
