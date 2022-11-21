import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdk extends ahcz implements aheo
{
    public static final apdk a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private aiet g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apdk.class, a = new apdk());
    }
    
    private apdk() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apdk.b) == null) {
                    synchronized (apdk.class) {
                        if (apdk.b == null) {
                            apdk.b = (ahev)new ahcs((ahcz)apdk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdk.a;
            }
            case 4: {
                return new ahcr((ahcz)apdk.a);
            }
            case 3: {
                return new apdk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdk.a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0006\u0007\u1409\u0002\b\u1409\u0003", new Object[] { "c", "d", "e", "h", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
