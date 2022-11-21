import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiee extends ahcz implements aheo
{
    public static final aiee a;
    private static volatile ahev c;
    public aied b;
    private int d;
    private aieb e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aiee.class, a = new aiee());
    }
    
    private aiee() {
        this.f = 2;
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
                final ahev c;
                if ((c = aiee.c) == null) {
                    synchronized (aiee.class) {
                        if (aiee.c == null) {
                            aiee.c = (ahev)new ahcs((ahcz)aiee.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiee.a;
            }
            case 4: {
                return new ahcr((ahcz)aiee.a);
            }
            case 3: {
                return new aiee();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiee.a, "\u0001\u0002\u0000\u0001\uf733\u45a2\ue98d\u4647\u0002\u0000\u0000\u0001\uf733\u45a2\u1009\u0002\ue98d\u4647\u1409\u0003", new Object[] { "d", "b", "e" });
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
