import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algj extends ahcz implements aheo
{
    public static final algj a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algj.class, a = new algj());
    }
    
    private algj() {
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
                if ((d = algj.d) == null) {
                    synchronized (algj.class) {
                        if (algj.d == null) {
                            algj.d = (ahev)new ahcs((ahcz)algj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algj.a;
            }
            case 4: {
                return new ahcr((ahcz)algj.a);
            }
            case 3: {
                return new algj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algj.a, "\u0001\u0006\u0001\u0000\uefcf\u2e35\uefaa\uc8b4\u0006\u0000\u0000\u0006\uefcf\u2e35\u143c\u0000\ufa55\u30cf\u143c\u0000\ufb74\u3a2c\u143c\u0000\ueb41\u48e5\u143c\u0000\ue1c0\ua279\u143c\u0000\uefaa\uc8b4\u143c\u0000", new Object[] { "c", "b", amhq.class, ajhb.class, ajyp.class, aoxu.class, aizn.class, aidw.class });
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
