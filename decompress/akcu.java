import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcu extends ahcz implements aheo
{
    public static final akcu a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akcu.class, a = new akcu());
    }
    
    private akcu() {
        this.g = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = akcu.b) == null) {
                    synchronized (akcu.class) {
                        if (akcu.b == null) {
                            akcu.b = (ahev)new ahcs((ahcz)akcu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcu.a;
            }
            case 4: {
                return new ahcr((ahcz)akcu.a);
            }
            case 3: {
                return new akcu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcu.a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0007\u1409\u0005", new Object[] { "c", "d", "e", "f" });
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
