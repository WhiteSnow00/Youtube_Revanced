import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgy extends ahcz implements aheo
{
    public static final apgy a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private aisc j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(apgy.class, a = new apgy());
    }
    
    private apgy() {
        this.l = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apgy.b) == null) {
                    synchronized (apgy.class) {
                        if (apgy.b == null) {
                            apgy.b = (ahev)new ahcs((ahcz)apgy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgy.a;
            }
            case 4: {
                return new ahcr((ahcz)apgy.a);
            }
            case 3: {
                return new apgy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgy.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0006\u0006\u1409\u0005\u0007\u1409\u0004\t\u1409\n\r\u1409\u0002", new Object[] { "c", "d", "e", "g", "j", "i", "h", "k", "f" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
