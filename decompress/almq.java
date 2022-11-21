import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almq extends ahcz implements aheo
{
    public static final almq a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(almq.class, a = new almq());
    }
    
    private almq() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b = almq.b) == null) {
                    synchronized (almq.class) {
                        if (almq.b == null) {
                            almq.b = (ahev)new ahcs((ahcz)almq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almq.a;
            }
            case 4: {
                return new ahcr((ahcz)almq.a);
            }
            case 3: {
                return new almq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almq.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
