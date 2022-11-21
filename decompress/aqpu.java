import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqpu extends ahcz implements aheo
{
    public static final aqpu a;
    private static volatile ahev h;
    public int b;
    public double c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    
    static {
        ahcz.registerDefaultInstance(aqpu.class, a = new aqpu());
    }
    
    private aqpu() {
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
                if ((h = aqpu.h) == null) {
                    synchronized (aqpu.class) {
                        if (aqpu.h == null) {
                            aqpu.h = (ahev)new ahcs((ahcz)aqpu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aqpu.a;
            }
            case 4: {
                return new ahcr((ahcz)aqpu.a);
            }
            case 3: {
                return new aqpu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqpu.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1007\u0001\u0003\u100b\u0002\u0004\u1007\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
