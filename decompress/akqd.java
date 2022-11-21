import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqd extends ahcz implements aheo
{
    public static final akqd a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public ahbt e;
    public ajws f;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(akqd.class, a = new akqd());
    }
    
    private akqd() {
        this.c = 0;
        this.i = 2;
        this.e = ahbt.b;
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
                final ahev g;
                if ((g = akqd.g) == null) {
                    synchronized (akqd.class) {
                        if (akqd.g == null) {
                            akqd.g = (ahev)new ahcs((ahcz)akqd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akqd.a;
            }
            case 4: {
                return new ahcr((ahcz)akqd.a);
            }
            case 3: {
                return new akqd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqd.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u143c\u0000\u0005\u103b\u0000", new Object[] { "d", "c", "b", "h", "e", "f", aisc.class });
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
