import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvq extends ahcz implements aheo
{
    public static final alvq a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aiet e;
    private ajws f;
    private ajws g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alvq.class, a = new alvq());
    }
    
    private alvq() {
        this.h = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alvq.b) == null) {
                    synchronized (alvq.class) {
                        if (alvq.b == null) {
                            alvq.b = (ahev)new ahcs((ahcz)alvq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alvq.a;
            }
            case 4: {
                return new ahcr((ahcz)alvq.a);
            }
            case 3: {
                return new alvq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvq.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
