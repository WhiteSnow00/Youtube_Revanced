import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpc extends ahcz implements aheo
{
    public static final akpc a;
    private static volatile ahev e;
    public int b;
    public aknh c;
    public ahdp d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akpc.class, a = new akpc());
    }
    
    private akpc() {
        this.f = 2;
        this.d = ahcz.emptyProtobufList();
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
                final ahev e;
                if ((e = akpc.e) == null) {
                    synchronized (akpc.class) {
                        if (akpc.e == null) {
                            akpc.e = (ahev)new ahcs((ahcz)akpc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpc.a;
            }
            case 4: {
                return new ahcr((short[][])null, (float[])null);
            }
            case 3: {
                return new akpc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpc.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0003\u001a", new Object[] { "b", "c", "d" });
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
