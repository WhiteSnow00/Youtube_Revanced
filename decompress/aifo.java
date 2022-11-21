import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifo extends ahcz implements aheo
{
    public static final aifo a;
    private static volatile ahev b;
    private int c;
    private aimb d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aifo.class, a = new aifo());
    }
    
    private aifo() {
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
                if ((b = aifo.b) == null) {
                    synchronized (aifo.class) {
                        if (aifo.b == null) {
                            aifo.b = (ahev)new ahcs((ahcz)aifo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifo.a;
            }
            case 4: {
                return new ahcr((ahcz)aifo.a);
            }
            case 3: {
                return new aifo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifo.a, "\u0001\u0001\u0000\u0001\ufd96\u2704\ufd96\u2704\u0001\u0000\u0000\u0001\ufd96\u2704\u1409\u0000", new Object[] { "c", "d" });
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
