import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphc extends ahcz implements aheo
{
    public static final aphc a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    private ajws e;
    private aisc f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aphc.class, a = new aphc());
    }
    
    private aphc() {
        this.i = 2;
        this.c = ahbt.b;
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
                final ahev d;
                if ((d = aphc.d) == null) {
                    synchronized (aphc.class) {
                        if (aphc.d == null) {
                            aphc.d = (ahev)new ahcs((ahcz)aphc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aphc.a;
            }
            case 4: {
                return new ahcr((ahcz)aphc.a);
            }
            case 3: {
                return new aphc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphc.a, "\u0001\u0005\u0000\u0001\u0003\f\u0005\u0000\u0000\u0004\u0003\u1409\u0001\u0007\u1409\u0005\b\u1409\u0006\u000b\u1409\t\f\u100a\n", new Object[] { "b", "e", "f", "g", "h", "c" });
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
