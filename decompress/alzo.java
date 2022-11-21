import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzo extends ahcz implements aheo
{
    public static final alzo a;
    private static volatile ahev h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    static {
        ahcz.registerDefaultInstance(alzo.class, a = new alzo());
    }
    
    private alzo() {
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
                if ((h = alzo.h) == null) {
                    synchronized (alzo.class) {
                        if (alzo.h == null) {
                            alzo.h = (ahev)new ahcs((ahcz)alzo.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alzo.a;
            }
            case 4: {
                return new ahcr((ahcz)alzo.a);
            }
            case 3: {
                return new alzo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzo.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u100b\u0004", new Object[] { "b", "c", alwa.p, "d", alzn.a(), "e", alwa.r, "f", alwa.q, "g" });
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
