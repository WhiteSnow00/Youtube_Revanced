import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahna extends ahcz implements aheo
{
    public static final ahna a;
    private static volatile ahev e;
    public int b;
    public aowb c;
    public ahnb d;
    private ahjl f;
    private ahoi g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(ahna.class, a = new ahna());
    }
    
    private ahna() {
        this.h = 2;
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
                final ahev e;
                if ((e = ahna.e) == null) {
                    synchronized (ahna.class) {
                        if (ahna.e == null) {
                            ahna.e = (ahev)new ahcs((ahcz)ahna.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahna.a;
            }
            case 4: {
                return new ahcr((ahcz)ahna.a);
            }
            case 3: {
                return new ahna();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahna.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "b", "c", "d", "f", "g" });
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
