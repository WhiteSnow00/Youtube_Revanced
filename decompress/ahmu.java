import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmu extends ahcz implements aheo
{
    public static final ahmu a;
    private static volatile ahev e;
    public int b;
    public int c;
    public float d;
    
    static {
        ahcz.registerDefaultInstance(ahmu.class, a = new ahmu());
    }
    
    private ahmu() {
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
                if ((e = ahmu.e) == null) {
                    synchronized (ahmu.class) {
                        if (ahmu.e == null) {
                            ahmu.e = (ahev)new ahcs((ahcz)ahmu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahmu.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmu.a);
            }
            case 3: {
                return new ahmu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1001\u0001", new Object[] { "b", "c", ahld.h, "d" });
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
