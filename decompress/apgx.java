import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgx extends ahcz implements aheo
{
    public static final apgx a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apgx.class, a = new apgx());
    }
    
    private apgx() {
        this.g = 2;
        emptyProtobufList();
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
                if ((b = apgx.b) == null) {
                    synchronized (apgx.class) {
                        if (apgx.b == null) {
                            apgx.b = (ahev)new ahcs((ahcz)apgx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgx.a;
            }
            case 4: {
                return new ahcr((ahcz)apgx.a);
            }
            case 3: {
                return new apgx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgx.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0001\u0004\u1409\u0003\u0006\u1409\u0002", new Object[] { "c", "d", "f", "e" });
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
