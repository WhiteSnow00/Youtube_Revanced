import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akra extends ahcz implements aheo
{
    public static final akra a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akra.class, a = new akra());
    }
    
    private akra() {
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
                if ((d = akra.d) == null) {
                    synchronized (akra.class) {
                        if (akra.d == null) {
                            akra.d = (ahev)new ahcs((ahcz)akra.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akra.a;
            }
            case 4: {
                return new ahcr((ahcz)akra.a);
            }
            case 3: {
                return new akra();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akra.a, "\u0001\u0002\u0001\u0000\ue8e9\u4616\ue8f3\u55ce\u0002\u0000\u0000\u0002\ue8e9\u4616\u143c\u0000\ue8f3\u55ce\u143c\u0000", new Object[] { "c", "b", amlf.class, anyp.class });
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
