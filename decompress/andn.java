import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andn extends ahcz implements aheo
{
    public static final andn a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private aiet h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(andn.class, a = new andn());
    }
    
    private andn() {
        this.j = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = andn.b) == null) {
                    synchronized (andn.class) {
                        if (andn.b == null) {
                            andn.b = (ahev)new ahcs((ahcz)andn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andn.a;
            }
            case 4: {
                return new ahcr((ahcz)andn.a);
            }
            case 3: {
                return new andn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)andn.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
