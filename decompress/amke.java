import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amke extends ahcz implements aheo
{
    public static final amke a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amke.class, a = new amke());
    }
    
    private amke() {
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
                if ((d = amke.d) == null) {
                    synchronized (amke.class) {
                        if (amke.d == null) {
                            amke.d = (ahev)new ahcs((ahcz)amke.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amke.a;
            }
            case 4: {
                return new ahcr((ahcz)amke.a);
            }
            case 3: {
                return new amke();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amke.a, "\u0001\u0005\u0001\u0000\uf716\u21ff\uf3ee\u92fd\u0005\u0000\u0000\u0005\uf716\u21ff\u143c\u0000\uec16\u3230\u143c\u0000\ueb3c\u5208\u143c\u0000\ufc61\u6243\u143c\u0000\uf3ee\u92fd\u143c\u0000", new Object[] { "c", "b", amkd.class, amkf.class, amkc.class, amkh.class, amka.class });
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
