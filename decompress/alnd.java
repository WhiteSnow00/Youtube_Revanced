import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alnd extends ahcz implements aheo
{
    public static final alnd a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alnd.class, a = new alnd());
    }
    
    private alnd() {
        this.i = 2;
        emptyProtobufList();
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
                if ((b = alnd.b) == null) {
                    synchronized (alnd.class) {
                        if (alnd.b == null) {
                            alnd.b = (ahev)new ahcs((ahcz)alnd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alnd.a;
            }
            case 4: {
                return new ahcr((ahcz)alnd.a);
            }
            case 3: {
                return new alnd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alnd.a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0004\t\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h" });
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
