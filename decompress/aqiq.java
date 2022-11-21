import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqiq extends ahcz implements aheo
{
    public static final aqiq a;
    private static volatile ahev d;
    public int b;
    public aqkf c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aqiq.class, a = new aqiq());
    }
    
    private aqiq() {
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
                final ahev d;
                if ((d = aqiq.d) == null) {
                    synchronized (aqiq.class) {
                        if (aqiq.d == null) {
                            aqiq.d = (ahev)new ahcs((ahcz)aqiq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqiq.a;
            }
            case 4: {
                return new ahcr((ahcz)aqiq.a);
            }
            case 3: {
                return new aqiq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqiq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
