import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alni extends ahcz implements aheo
{
    public static final alni a;
    private static volatile ahev b;
    private int c;
    private alnk d;
    private alnj e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(alni.class, a = new alni());
    }
    
    private alni() {
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
                if ((b = alni.b) == null) {
                    synchronized (alni.class) {
                        if (alni.b == null) {
                            alni.b = (ahev)new ahcs((ahcz)alni.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alni.a;
            }
            case 4: {
                return new ahcr((ahcz)alni.a);
            }
            case 3: {
                return new alni();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alni.a, "\u0001\u0002\u0000\u0001%\uef62\u9d56\u0002\u0000\u0000\u0002%\u1409\u0012\uef62\u9d56\u1409\u0013", new Object[] { "c", "d", "e" });
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
