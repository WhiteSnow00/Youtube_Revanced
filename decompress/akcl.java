import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcl extends ahcz implements aheo
{
    public static final akcl a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(akcl.class, a = new akcl());
    }
    
    private akcl() {
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
                if ((b = akcl.b) == null) {
                    synchronized (akcl.class) {
                        if (akcl.b == null) {
                            akcl.b = (ahev)new ahcs((ahcz)akcl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcl.a;
            }
            case 4: {
                return new ahcr((ahcz)akcl.a);
            }
            case 3: {
                return new akcl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcl.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
