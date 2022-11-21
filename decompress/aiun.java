import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiun extends ahcz implements aheo
{
    public static final aiun a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aitt e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aiun.class, a = new aiun());
    }
    
    private aiun() {
        this.f = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = aiun.b) == null) {
                    synchronized (aiun.class) {
                        if (aiun.b == null) {
                            aiun.b = (ahev)new ahcs((ahcz)aiun.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiun.a;
            }
            case 4: {
                return new ahcr((ahcz)aiun.a);
            }
            case 3: {
                return new aiun();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiun.a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003\u1409\u0001\u0005\u1409\u0000", new Object[] { "c", "e", "d" });
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
