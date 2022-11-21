import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkf extends ahcz implements aheo
{
    public static final amkf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amkf.class, a = new amkf());
    }
    
    private amkf() {
        this.f = 2;
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
                if ((b = amkf.b) == null) {
                    synchronized (amkf.class) {
                        if (amkf.b == null) {
                            amkf.b = (ahev)new ahcs((ahcz)amkf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amkf.a;
            }
            case 4: {
                return new ahcr((ahcz)amkf.a);
            }
            case 3: {
                return new amkf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkf.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0004\u1409\u0002", new Object[] { "c", "d", "e" });
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
