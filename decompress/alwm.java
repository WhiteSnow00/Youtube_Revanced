import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwm extends ahcz implements aheo
{
    public static final alwm a;
    private static volatile ahev b;
    private int c;
    private alwl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alwm.class, a = new alwm());
    }
    
    private alwm() {
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
                final ahev b;
                if ((b = alwm.b) == null) {
                    synchronized (alwm.class) {
                        if (alwm.b == null) {
                            alwm.b = (ahev)new ahcs((ahcz)alwm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alwm.a;
            }
            case 4: {
                return new ahcr((ahcz)alwm.a);
            }
            case 3: {
                return new alwm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwm.a, "\u0001\u0001\u0000\u0001\uf7d9\u2b8e\uf7d9\u2b8e\u0001\u0000\u0000\u0001\uf7d9\u2b8e\u1409\u0000", new Object[] { "c", "d" });
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
