import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptw extends ahcz implements aheo
{
    public static final aptw a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aptw.class, a = new aptw());
    }
    
    private aptw() {
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
                if ((d = aptw.d) == null) {
                    synchronized (aptw.class) {
                        if (aptw.d == null) {
                            aptw.d = (ahev)new ahcs((ahcz)aptw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptw.a;
            }
            case 4: {
                return new ahcr((ahcz)aptw.a);
            }
            case 3: {
                return new aptw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptw.a, "\u0001\u0005\u0001\u0000\ue018\u17aa\ueea5\u37f3\u0005\u0000\u0000\u0005\ue018\u17aa\u143c\u0000\ufa4c\u17d2\u143c\u0000\uf74f\u2a6b\u143c\u0000\uf415\u3337\u143c\u0000\ueea5\u37f3\u143c\u0000", new Object[] { "c", "b", aptm.class, apul.class, akeg.class, apuk.class, aptk.class });
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
