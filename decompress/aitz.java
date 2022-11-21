import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitz extends ahcz implements aheo
{
    public static final aitz a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aitz.class, a = new aitz());
    }
    
    private aitz() {
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
                if ((d = aitz.d) == null) {
                    synchronized (aitz.class) {
                        if (aitz.d == null) {
                            aitz.d = (ahev)new ahcs((ahcz)aitz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aitz.a;
            }
            case 4: {
                return new ahcr((ahcz)aitz.a);
            }
            case 3: {
                return new aitz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitz.a, "\u0001\u0003\u0001\u0000\ue87b\u1db3\ufac6\ud1c6\u0003\u0000\u0000\u0002\ue87b\u1db3\u143c\u0000\uf72c\u4c0d\u143c\u0000\ufac6\ud1c6\u103c\u0000", new Object[] { "c", "b", aitx.class, ajaf.class, aivh.class });
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
