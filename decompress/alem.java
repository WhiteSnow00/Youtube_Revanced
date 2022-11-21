import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alem extends ahcz implements aheo
{
    public static final alem a;
    private static volatile ahev e;
    public int b;
    public akvy c;
    public alel d;
    
    static {
        ahcz.registerDefaultInstance(alem.class, a = new alem());
    }
    
    private alem() {
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
                if ((e = alem.e) == null) {
                    synchronized (alem.class) {
                        if (alem.e == null) {
                            alem.e = (ahev)new ahcs((ahcz)alem.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alem.a;
            }
            case 4: {
                return new ahcr((ahcz)alem.a);
            }
            case 3: {
                return new alem();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alem.a, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003\u1009\u0002\u0006\u1009\u0005", new Object[] { "b", "c", "d" });
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
