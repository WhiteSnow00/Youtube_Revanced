import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aper extends ahcz implements aheo
{
    public static final aper a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aisc f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aper.class, a = new aper());
    }
    
    private aper() {
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
                if ((b = aper.b) == null) {
                    synchronized (aper.class) {
                        if (aper.b == null) {
                            aper.b = (ahev)new ahcs((ahcz)aper.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aper.a;
            }
            case 4: {
                return new ahcr((ahcz)aper.a);
            }
            case 3: {
                return new aper();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aper.a, "\u0001\u0005\u0000\u0001\u0002\f\u0005\u0000\u0000\u0005\u0002\u1409\u0001\u0004\u1409\u0004\u0005\u1409\u0005\u0007\u1409\n\f\u1409\u0002", new Object[] { "c", "d", "f", "g", "h", "e" });
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
