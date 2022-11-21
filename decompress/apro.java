import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apro extends ahcz implements aheo
{
    public static final apro a;
    private static volatile ahev c;
    public amzj b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apro.class, a = new apro());
    }
    
    private apro() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = apro.c) == null) {
                    synchronized (apro.class) {
                        if (apro.c == null) {
                            apro.c = (ahev)new ahcs((ahcz)apro.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apro.a;
            }
            case 4: {
                return new ahcr((ahcz)apro.a);
            }
            case 3: {
                return new apro();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apro.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
