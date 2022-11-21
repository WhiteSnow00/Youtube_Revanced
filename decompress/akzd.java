import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzd extends ahcz implements aheo
{
    public static final akzd a;
    private static volatile ahev b;
    private int c;
    private akzi d;
    private akzf e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akzd.class, a = new akzd());
    }
    
    private akzd() {
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
                if ((b = akzd.b) == null) {
                    synchronized (akzd.class) {
                        if (akzd.b == null) {
                            akzd.b = (ahev)new ahcs((ahcz)akzd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akzd.a;
            }
            case 4: {
                return new ahcr((ahcz)akzd.a);
            }
            case 3: {
                return new akzd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
