import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amon extends ahcz implements aheo
{
    public static final amon a;
    private static volatile ahev b;
    private int c;
    private amoo d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amon.class, a = new amon());
    }
    
    private amon() {
        this.f = 2;
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
                if ((b = amon.b) == null) {
                    synchronized (amon.class) {
                        if (amon.b == null) {
                            amon.b = (ahev)new ahcs((ahcz)amon.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amon.a;
            }
            case 4: {
                return new ahcr((ahcz)amon.a);
            }
            case 3: {
                return new amon();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amon.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
