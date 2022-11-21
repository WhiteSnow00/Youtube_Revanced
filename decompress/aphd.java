import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aphd extends ahcz implements aheo
{
    public static final aphd a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    private ajws e;
    private ajws f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aphd.class, a = new aphd());
    }
    
    private aphd() {
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
                if ((d = aphd.d) == null) {
                    synchronized (aphd.class) {
                        if (aphd.d == null) {
                            aphd.d = (ahev)new ahcs((ahcz)aphd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aphd.a;
            }
            case 4: {
                return new ahcr((ahcz)aphd.a);
            }
            case 3: {
                return new aphd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aphd.a, "\u0001\u0005\u0000\u0001\u0003\r\u0005\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u000b\u1409\t\f\u100a\n\r\u1409\u0006", new Object[] { "b", "e", "f", "h", "c", "g" });
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
