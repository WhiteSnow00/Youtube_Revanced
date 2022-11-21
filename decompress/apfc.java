import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfc extends ahcz implements aheo
{
    public static final apfc a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private aiet g;
    private aiet h;
    private aiet i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apfc.class, a = new apfc());
    }
    
    private apfc() {
        this.k = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = apfc.b) == null) {
                    synchronized (apfc.class) {
                        if (apfc.b == null) {
                            apfc.b = (ahev)new ahcs((ahcz)apfc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfc.a;
            }
            case 4: {
                return new ahcr((ahcz)apfc.a);
            }
            case 3: {
                return new apfc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfc.a, "\u0001\u0007\u0000\u0001\u0002\r\u0007\u0000\u0000\u0007\u0002\u1409\u0004\u0003\u1409\u0005\u0004\u1409\u0006\u0006\u1409\n\u0007\u1409\u0003\f\u1409\u0007\r\u1409\b", new Object[] { "c", "e", "f", "g", "j", "d", "h", "i" });
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
