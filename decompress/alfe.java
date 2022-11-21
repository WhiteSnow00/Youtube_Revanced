import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfe extends ahcz implements aheo
{
    public static final alfe a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alfe.class, a = new alfe());
    }
    
    private alfe() {
        this.b = 0;
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
                final ahev d;
                if ((d = alfe.d) == null) {
                    synchronized (alfe.class) {
                        if (alfe.d == null) {
                            alfe.d = (ahev)new ahcs((ahcz)alfe.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfe.a;
            }
            case 4: {
                return new ahcr((ahcz)alfe.a);
            }
            case 3: {
                return new alfe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfe.a, "\u0001\u0001\u0001\u0000\ue517\u1e94\ue517\u1e94\u0001\u0000\u0000\u0001\ue517\u1e94\u143c\u0000", new Object[] { "c", "b", apkk.class });
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
