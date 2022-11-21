import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuj extends ahcz implements aheo
{
    public static final aiuj a;
    private static volatile ahev g;
    public int b;
    public aivb c;
    public ajws d;
    public ajws e;
    public aiuq f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aiuj.class, a = new aiuj());
    }
    
    private aiuj() {
        this.h = 2;
        emptyProtobufList();
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
                if ((g = aiuj.g) == null) {
                    synchronized (aiuj.class) {
                        if (aiuj.g == null) {
                            aiuj.g = (ahev)new ahcs((ahcz)aiuj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aiuj.a;
            }
            case 4: {
                return new ahcr((ahcz)aiuj.a);
            }
            case 3: {
                return new aiuj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiuj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
