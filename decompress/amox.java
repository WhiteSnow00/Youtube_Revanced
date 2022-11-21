import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amox extends ahcz implements aheo
{
    public static final amox a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private aisc g;
    private ahjl h;
    private anxb i;
    private anxb j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(amox.class, a = new amox());
    }
    
    private amox() {
        this.k = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amox.b) == null) {
                    synchronized (amox.class) {
                        if (amox.b == null) {
                            amox.b = (ahev)new ahcs((ahcz)amox.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amox.a;
            }
            case 4: {
                return new ahcr((ahcz)amox.a);
            }
            case 3: {
                return new amox();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amox.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0005\u0007\u1409\u0006\n\u1409\t\u000b\u1409\n", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
