import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnq extends ahcz implements aheo
{
    public static final amnq a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amnq.class, a = new amnq());
    }
    
    private amnq() {
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
                if ((d = amnq.d) == null) {
                    synchronized (amnq.class) {
                        if (amnq.d == null) {
                            amnq.d = (ahev)new ahcs((ahcz)amnq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amnq.a;
            }
            case 4: {
                return new ahcr((ahcz)amnq.a);
            }
            case 3: {
                return new amnq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnq.a, "\u0001\u0001\u0001\u0000\uf171\u3996\uf171\u3996\u0001\u0000\u0000\u0001\uf171\u3996\u143c\u0000", new Object[] { "c", "b", amnm.class });
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
