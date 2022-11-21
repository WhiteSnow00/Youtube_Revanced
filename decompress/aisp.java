import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisp extends ahcz implements aheo
{
    public static final aisp a;
    private static volatile ahev g;
    public int b;
    public akfj c;
    public ajws d;
    public aisl e;
    public ajws f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aisp.class, a = new aisp());
    }
    
    private aisp() {
        this.h = 2;
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
                final ahev g;
                if ((g = aisp.g) == null) {
                    synchronized (aisp.class) {
                        if (aisp.g == null) {
                            aisp.g = (ahev)new ahcs((ahcz)aisp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aisp.a;
            }
            case 4: {
                return new ahcr((ahcz)aisp.a);
            }
            case 3: {
                return new aisp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
