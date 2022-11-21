import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ampd extends ahcz implements aheo
{
    public static final ampd a;
    private static volatile ahev b;
    private int c;
    private int d;
    private ampc e;
    private aisc f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ampd.class, a = new ampd());
    }
    
    private ampd() {
        this.g = 2;
        ahcz.emptyProtobufList();
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
                if ((b = ampd.b) == null) {
                    synchronized (ampd.class) {
                        if (ampd.b == null) {
                            ampd.b = (ahev)new ahcs((ahcz)ampd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ampd.a;
            }
            case 4: {
                return new ahcr((ahcz)ampd.a);
            }
            case 3: {
                return new ampd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ampd.a, "\u0001\u0002\u0000\u0002\u001di\u0002\u0000\u0000\u0002\u001d\u1409\u0010i\u14092", new Object[] { "c", "d", "e", "f" });
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
