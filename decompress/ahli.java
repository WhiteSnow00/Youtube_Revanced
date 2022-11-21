import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahli extends ahcz implements aheo
{
    public static final ahli a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public ahbt d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(ahli.class, a = new ahli());
    }
    
    private ahli() {
        this.f = 2;
        this.d = ahbt.b;
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
                final ahev e;
                if ((e = ahli.e) == null) {
                    synchronized (ahli.class) {
                        if (ahli.e == null) {
                            ahli.e = (ahev)new ahcs((ahcz)ahli.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahli.a;
            }
            case 4: {
                return new ahcr((ahcz)ahli.a);
            }
            case 3: {
                return new ahli();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahli.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
