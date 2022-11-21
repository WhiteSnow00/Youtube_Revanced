import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvt extends ahcz implements aheo
{
    public static final alvt a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private aiet f;
    private aiet g;
    private aiet h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alvt.class, a = new alvt());
    }
    
    private alvt() {
        this.i = 2;
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
                if ((b = alvt.b) == null) {
                    synchronized (alvt.class) {
                        if (alvt.b == null) {
                            alvt.b = (ahev)new ahcs((ahcz)alvt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alvt.a;
            }
            case 4: {
                return new ahcr((ahcz)alvt.a);
            }
            case 3: {
                return new alvt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvt.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
