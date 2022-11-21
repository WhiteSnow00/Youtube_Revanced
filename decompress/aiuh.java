import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuh extends ahcz implements aheo
{
    public static final aiuh a;
    private static volatile ahev b;
    private int c;
    private aiug d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aiuh.class, a = new aiuh());
    }
    
    private aiuh() {
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
                if ((b = aiuh.b) == null) {
                    synchronized (aiuh.class) {
                        if (aiuh.b == null) {
                            aiuh.b = (ahev)new ahcs((ahcz)aiuh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiuh.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuh.a);
            }
            case 3: {
                return new aiuh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuh.a, "\u0001\u0001\u0000\u0001\ue5a5\u334e\ue5a5\u334e\u0001\u0000\u0000\u0001\ue5a5\u334e\u1409\u0000", new Object[] { "c", "d" });
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
