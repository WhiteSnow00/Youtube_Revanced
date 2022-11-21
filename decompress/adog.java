import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adog extends ahcz implements aheo
{
    public static final adog a;
    private static volatile ahev h;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    
    static {
        ahcz.registerDefaultInstance(adog.class, a = new adog());
    }
    
    private adog() {
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
                if ((h = adog.h) == null) {
                    synchronized (adog.class) {
                        if (adog.h == null) {
                            adog.h = (ahev)new ahcs((ahcz)adog.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return adog.a;
            }
            case 4: {
                return new ahcr((ahcz)adog.a);
            }
            case 3: {
                return new adog();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adog.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100b\u0002\u0004\u1003\u0003\u0005\u1003\u0004", new Object[] { "b", "c", pfw.p, "d", apkh.a(), "e", "f", "g" });
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
