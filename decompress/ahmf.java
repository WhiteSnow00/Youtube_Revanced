import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmf extends ahcz implements aheo
{
    public static final ahmf a;
    private static volatile ahev b;
    private int c;
    private akhu d;
    private anny e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(ahmf.class, a = new ahmf());
    }
    
    private ahmf() {
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
                if ((b = ahmf.b) == null) {
                    synchronized (ahmf.class) {
                        if (ahmf.b == null) {
                            ahmf.b = (ahev)new ahcs((ahcz)ahmf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahmf.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmf.a);
            }
            case 3: {
                return new ahmf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmf.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
