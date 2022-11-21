import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidx extends ahcz implements aheo
{
    public static final aidx a;
    private static volatile ahev b;
    private int c;
    private ajzc d;
    private ajze e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aidx.class, a = new aidx());
    }
    
    private aidx() {
        this.g = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aidx.b) == null) {
                    synchronized (aidx.class) {
                        if (aidx.b == null) {
                            aidx.b = (ahev)new ahcs((ahcz)aidx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aidx.a;
            }
            case 4: {
                return new ahcr((ahcz)aidx.a);
            }
            case 3: {
                return new aidx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
