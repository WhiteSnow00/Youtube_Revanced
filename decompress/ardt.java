import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardt extends ahcz implements aheo
{
    public static final ardt a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(ardt.class, a = new ardt());
    }
    
    private ardt() {
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
                if ((d = ardt.d) == null) {
                    synchronized (ardt.class) {
                        if (ardt.d == null) {
                            ardt.d = (ahev)new ahcs((ahcz)ardt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ardt.a;
            }
            case 4: {
                return new ahcr((ahcz)ardt.a);
            }
            case 3: {
                return new ardt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardt.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", ardq.class, ards.class });
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
