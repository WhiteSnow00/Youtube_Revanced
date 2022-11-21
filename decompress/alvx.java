import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvx extends ahcz implements aheo
{
    public static final alvx a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alvx.class, a = new alvx());
    }
    
    private alvx() {
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
                final ahev b;
                if ((b = alvx.b) == null) {
                    synchronized (alvx.class) {
                        if (alvx.b == null) {
                            alvx.b = (ahev)new ahcs((ahcz)alvx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alvx.a;
            }
            case 4: {
                return new ahcr((ahcz)alvx.a);
            }
            case 3: {
                return new alvx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvx.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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
