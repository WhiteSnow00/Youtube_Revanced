import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alaf extends ahcz implements aheo
{
    public static final alaf a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alaf.class, a = new alaf());
    }
    
    private alaf() {
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
                if ((d = alaf.d) == null) {
                    synchronized (alaf.class) {
                        if (alaf.d == null) {
                            alaf.d = (ahev)new ahcs((ahcz)alaf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alaf.a;
            }
            case 4: {
                return new ahcr((ahcz)alaf.a);
            }
            case 3: {
                return new alaf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alaf.a, "\u0001\u0002\u0001\u0000\ue467\u2562\uf2e8\u457a\u0002\u0000\u0000\u0002\ue467\u2562\u143c\u0000\uf2e8\u457a\u143c\u0000", new Object[] { "c", "b", anme.class, ajwf.class });
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
