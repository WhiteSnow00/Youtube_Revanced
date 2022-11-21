import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbw extends ahcz implements aheo
{
    public static final arbw a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(arbw.class, a = new arbw());
    }
    
    private arbw() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = arbw.d) == null) {
                    synchronized (arbw.class) {
                        if (arbw.d == null) {
                            arbw.d = (ahev)new ahcs((ahcz)arbw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arbw.a;
            }
            case 4: {
                return new ahcr((ahcz)arbw.a);
            }
            case 3: {
                return new arbw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbw.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", ahhm.class, ahhm.class });
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
