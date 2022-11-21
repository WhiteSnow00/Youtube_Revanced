import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqp extends ahcz implements aheo
{
    public static final akqp a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akqp.class, a = new akqp());
    }
    
    private akqp() {
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
                if ((d = akqp.d) == null) {
                    synchronized (akqp.class) {
                        if (akqp.d == null) {
                            akqp.d = (ahev)new ahcs((ahcz)akqp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akqp.a;
            }
            case 4: {
                return new ahcr((ahcz)akqp.a);
            }
            case 3: {
                return new akqp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqp.a, "\u0001\u0004\u0001\u0000\uf486\u28b5\ue7fb\u51b0\u0004\u0000\u0000\u0004\uf486\u28b5\u143c\u0000\uf730\u3b2e\u143c\u0000\uf731\u3b2e\u143c\u0000\ue7fb\u51b0\u143c\u0000", new Object[] { "c", "b", ajtu.class, akqq.class, akqo.class, alpm.class });
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
