import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyi extends ahcz implements aheo
{
    public static final apyi a;
    private static volatile ahev c;
    public apyj b;
    private int d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apyi.class, a = new apyi());
    }
    
    private apyi() {
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
                final ahev c;
                if ((c = apyi.c) == null) {
                    synchronized (apyi.class) {
                        if (apyi.c == null) {
                            apyi.c = (ahev)new ahcs((ahcz)apyi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apyi.a;
            }
            case 4: {
                return new ahcr((ahcz)apyi.a);
            }
            case 3: {
                return new apyi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
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
