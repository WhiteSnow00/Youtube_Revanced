import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoka extends ahcz implements aheo
{
    public static final aoka a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aoka.class, a = new aoka());
    }
    
    private aoka() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aoka.d) == null) {
                    synchronized (aoka.class) {
                        if (aoka.d == null) {
                            aoka.d = (ahev)new ahcs((ahcz)aoka.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoka.a;
            }
            case 4: {
                return new ahcr((ahcz)aoka.a);
            }
            case 3: {
                return new aoka();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoka.a, "\u0001\u0001\u0001\u0000\ue61f\u1e16\ue61f\u1e16\u0001\u0000\u0000\u0001\ue61f\u1e16\u143c\u0000", new Object[] { "c", "b", apjc.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
