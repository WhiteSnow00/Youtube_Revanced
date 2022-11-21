import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgu extends ahcz implements aheo
{
    public static final apgu a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apgu.class, a = new apgu());
    }
    
    private apgu() {
        this.i = 2;
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
                if ((b = apgu.b) == null) {
                    synchronized (apgu.class) {
                        if (apgu.b == null) {
                            apgu.b = (ahev)new ahcs((ahcz)apgu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apgu.a;
            }
            case 4: {
                return new ahcr((ahcz)apgu.a);
            }
            case 3: {
                return new apgu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgu.a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0005\u0002\u1409\u0002\u0005\u1409\b\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006", new Object[] { "c", "d", "h", "e", "f", "g" });
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
