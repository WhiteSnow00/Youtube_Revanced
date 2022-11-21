import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alvr extends ahcz implements aheo
{
    public static final alvr a;
    private static volatile ahev b;
    private int c;
    private alwm d;
    private alwh e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(alvr.class, a = new alvr());
    }
    
    private alvr() {
        this.f = 2;
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
                if ((b = alvr.b) == null) {
                    synchronized (alvr.class) {
                        if (alvr.b == null) {
                            alvr.b = (ahev)new ahcs((ahcz)alvr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alvr.a;
            }
            case 4: {
                return new ahcr((ahcz)alvr.a);
            }
            case 3: {
                return new alvr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alvr.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002\u1409\u0000\u0004\u1409\u0001", new Object[] { "c", "d", "e" });
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
