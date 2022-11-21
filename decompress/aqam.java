import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqam extends ahcz implements aheo
{
    public static final aqam a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aqam.class, a = new aqam());
    }
    
    private aqam() {
        this.e = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = aqam.b) == null) {
                    synchronized (aqam.class) {
                        if (aqam.b == null) {
                            aqam.b = (ahev)new ahcs((ahcz)aqam.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqam.a;
            }
            case 4: {
                return new ahcr((ahcz)aqam.a);
            }
            case 3: {
                return new aqam();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqam.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
