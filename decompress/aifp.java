import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifp extends ahcz implements aheo
{
    public static final aifp a;
    private static volatile ahev b;
    private int c;
    private aimc d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aifp.class, a = new aifp());
    }
    
    private aifp() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aifp.b) == null) {
                    synchronized (aifp.class) {
                        if (aifp.b == null) {
                            aifp.b = (ahev)new ahcs((ahcz)aifp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifp.a;
            }
            case 4: {
                return new ahcr((ahcz)aifp.a);
            }
            case 3: {
                return new aifp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifp.a, "\u0001\u0001\u0000\u0001\ue964\u2872\ue964\u2872\u0001\u0000\u0000\u0001\ue964\u2872\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
