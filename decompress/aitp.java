import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitp extends ahcz implements aheo
{
    public static final aitp a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private anxb e;
    private anxb f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aitp.class, a = new aitp());
    }
    
    private aitp() {
        this.h = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aitp.b) == null) {
                    synchronized (aitp.class) {
                        if (aitp.b == null) {
                            aitp.b = (ahev)new ahcs((ahcz)aitp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aitp.a;
            }
            case 4: {
                return new ahcr((ahcz)aitp.a);
            }
            case 3: {
                return new aitp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitp.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
