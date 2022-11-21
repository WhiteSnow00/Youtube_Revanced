import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkp extends ahcz implements aheo
{
    public static final amkp a;
    private static volatile ahev d;
    public int b;
    public alho c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amkp.class, a = new amkp());
    }
    
    private amkp() {
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
                if ((d = amkp.d) == null) {
                    synchronized (amkp.class) {
                        if (amkp.d == null) {
                            amkp.d = (ahev)new ahcs((ahcz)amkp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amkp.a;
            }
            case 4: {
                return new ahcr((ahcz)amkp.a);
            }
            case 3: {
                return new amkp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkp.a, "\u0001\u0001\u0000\u0001\ue6c8\u3b15\ue6c8\u3b15\u0001\u0000\u0000\u0001\ue6c8\u3b15\u1409\u0000", new Object[] { "b", "c" });
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
