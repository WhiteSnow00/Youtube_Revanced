import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiex extends ahcz implements aheo
{
    public static final aiex a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aiex.class, a = new aiex());
    }
    
    private aiex() {
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
                final ahev b;
                if ((b = aiex.b) == null) {
                    synchronized (aiex.class) {
                        if (aiex.b == null) {
                            aiex.b = (ahev)new ahcs((ahcz)aiex.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiex.a;
            }
            case 4: {
                return new ahcr((ahcz)aiex.a);
            }
            case 3: {
                return new aiex();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiex.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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
