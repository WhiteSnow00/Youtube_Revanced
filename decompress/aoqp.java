import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqp extends ahcz implements aheo
{
    public static final aoqp a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aoqp.class, a = new aoqp());
    }
    
    private aoqp() {
        this.f = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aoqp.b) == null) {
                    synchronized (aoqp.class) {
                        if (aoqp.b == null) {
                            aoqp.b = (ahev)new ahcs((ahcz)aoqp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoqp.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqp.a);
            }
            case 3: {
                return new aoqp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqp.a, "\u0001\u0002\u0000\u0001\u0003\b\u0002\u0000\u0000\u0002\u0003\u1409\u0007\b\u1409\b", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
