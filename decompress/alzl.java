import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzl extends ahcz implements aheo
{
    public static final alzl a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(alzl.class, a = new alzl());
    }
    
    private alzl() {
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
                if ((b = alzl.b) == null) {
                    synchronized (alzl.class) {
                        if (alzl.b == null) {
                            alzl.b = (ahev)new ahcs((ahcz)alzl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alzl.a;
            }
            case 4: {
                return new ahcr((ahcz)alzl.a);
            }
            case 3: {
                return new alzl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzl.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0000\u0003\u1409\u0001", new Object[] { "c", "d", "e" });
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
