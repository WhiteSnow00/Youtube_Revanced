import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akca extends ahcz implements aheo
{
    public static final akca a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akca.class, a = new akca());
    }
    
    private akca() {
        this.f = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                if ((b = akca.b) == null) {
                    synchronized (akca.class) {
                        if (akca.b == null) {
                            akca.b = (ahev)new ahcs((ahcz)akca.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akca.a;
            }
            case 4: {
                return new ahcr((ahcz)akca.a);
            }
            case 3: {
                return new akca();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akca.a, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0002\u0004\u1409\u0003\u0006\u1409\u0001", new Object[] { "c", "e", "d" });
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
