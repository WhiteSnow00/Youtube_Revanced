import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiut extends ahcz implements aheo
{
    public static final aiut a;
    private static volatile ahev b;
    private int c;
    private aius d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiut.class, a = new aiut());
    }
    
    private aiut() {
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
                if ((b = aiut.b) == null) {
                    synchronized (aiut.class) {
                        if (aiut.b == null) {
                            aiut.b = (ahev)new ahcs((ahcz)aiut.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiut.a;
            }
            case 4: {
                return new ahcr((ahcz)aiut.a);
            }
            case 3: {
                return new aiut();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiut.a, "\u0001\u0001\u0000\u0001\ue706\u29c1\ue706\u29c1\u0001\u0000\u0000\u0001\ue706\u29c1\u1409\u0000", new Object[] { "c", "d" });
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
