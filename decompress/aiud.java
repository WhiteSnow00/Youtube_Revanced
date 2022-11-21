import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiud extends ahcz implements aheo
{
    public static final aiud a;
    private static volatile ahev b;
    private int c;
    private aias d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiud.class, a = new aiud());
    }
    
    private aiud() {
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
                if ((b = aiud.b) == null) {
                    synchronized (aiud.class) {
                        if (aiud.b == null) {
                            aiud.b = (ahev)new ahcs((ahcz)aiud.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiud.a;
            }
            case 4: {
                return new ahcr((ahcz)aiud.a);
            }
            case 3: {
                return new aiud();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiud.a, "\u0001\u0001\u0000\u0001\uead9\u3993\uead9\u3993\u0001\u0000\u0000\u0001\uead9\u3993\u1409\u0000", new Object[] { "c", "d" });
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
