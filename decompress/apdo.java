import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdo extends ahcz implements aheo
{
    public static final apdo a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private aofv f;
    private apdn g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apdo.class, a = new apdo());
    }
    
    private apdo() {
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
                if ((b = apdo.b) == null) {
                    synchronized (apdo.class) {
                        if (apdo.b == null) {
                            apdo.b = (ahev)new ahcs((ahcz)apdo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apdo.a;
            }
            case 4: {
                return new ahcr((ahcz)apdo.a);
            }
            case 3: {
                return new apdo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdo.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
