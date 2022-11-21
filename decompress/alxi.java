import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxi extends ahcz implements aheo
{
    public static final alxi a;
    private static volatile ahev h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    
    static {
        ahcz.registerDefaultInstance(alxi.class, a = new alxi());
    }
    
    private alxi() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = alxi.h) == null) {
                    synchronized (alxi.class) {
                        if (alxi.h == null) {
                            alxi.h = (ahev)new ahcs((ahcz)alxi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alxi.a;
            }
            case 4: {
                return new ahcr((ahcz)alxi.a);
            }
            case 3: {
                return new alxi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxi.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u1002\u0006", new Object[] { "b", "c", alwa.i, "d", "e", "f", "g" });
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
