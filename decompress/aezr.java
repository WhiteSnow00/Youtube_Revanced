import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aezr extends ahcz implements aheo
{
    public static final aezr a;
    private static volatile ahev g;
    public int b;
    public ahbt c;
    public ahbt d;
    public aezq e;
    public aezm f;
    
    static {
        ahcz.registerDefaultInstance(aezr.class, a = new aezr());
    }
    
    private aezr() {
        this.c = ahbt.b;
        this.d = ahbt.b;
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
                if ((g = aezr.g) == null) {
                    synchronized (aezr.class) {
                        if (aezr.g == null) {
                            aezr.g = (ahev)new ahcs((ahcz)aezr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aezr.a;
            }
            case 4: {
                return new ahcr((ahcz)aezr.a);
            }
            case 3: {
                return new aezr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aezr.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
