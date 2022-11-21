import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apet extends ahcz implements aheo
{
    public static final apet a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apet.class, a = new apet());
    }
    
    private apet() {
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
                if ((b = apet.b) == null) {
                    synchronized (apet.class) {
                        if (apet.b == null) {
                            apet.b = (ahev)new ahcs((ahcz)apet.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apet.a;
            }
            case 4: {
                return new ahcr((ahcz)apet.a);
            }
            case 3: {
                return new apet();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apet.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002\u1409\u0002\u0004\u1409\u0001", new Object[] { "c", "e", "d" });
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
