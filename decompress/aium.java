import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aium extends ahcz implements aheo
{
    public static final aium a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aium.class, a = new aium());
    }
    
    private aium() {
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
                if ((b = aium.b) == null) {
                    synchronized (aium.class) {
                        if (aium.b == null) {
                            aium.b = (ahev)new ahcs((ahcz)aium.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aium.a;
            }
            case 4: {
                return new ahcr((ahcz)aium.a);
            }
            case 3: {
                return new aium();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aium.a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0004\u1409\u0002\u0006\u1409\u0006\u0007\u1409\u0004\n\u1409\t", new Object[] { "c", "d", "e", "g", "f", "h" });
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
