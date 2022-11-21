import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphr extends ahcz implements aheo
{
    public static final aphr a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aphr.class, a = new aphr());
    }
    
    private aphr() {
        this.h = 2;
        final ahbt b = ahbt.b;
        emptyProtobufList();
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
                if ((b = aphr.b) == null) {
                    synchronized (aphr.class) {
                        if (aphr.b == null) {
                            aphr.b = (ahev)new ahcs((ahcz)aphr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aphr.a;
            }
            case 4: {
                return new ahcr((ahcz)aphr.a);
            }
            case 3: {
                return new aphr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphr.a, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g" });
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
