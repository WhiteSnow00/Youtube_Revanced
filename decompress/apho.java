import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apho extends ahcz implements aheo
{
    public static final apho a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aphn f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apho.class, a = new apho());
    }
    
    private apho() {
        this.h = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apho.b) == null) {
                    synchronized (apho.class) {
                        if (apho.b == null) {
                            apho.b = (ahev)new ahcs((ahcz)apho.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apho.a;
            }
            case 4: {
                return new ahcr((ahcz)apho.a);
            }
            case 3: {
                return new apho();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apho.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0002", new Object[] { "c", "d", "e", "g", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
