import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzt extends ahcz implements aheo
{
    public static final akzt a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akzt.class, a = new akzt());
    }
    
    private akzt() {
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
                if ((d = akzt.d) == null) {
                    synchronized (akzt.class) {
                        if (akzt.d == null) {
                            akzt.d = (ahev)new ahcs((ahcz)akzt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akzt.a;
            }
            case 4: {
                return new ahcr((ahcz)akzt.a);
            }
            case 3: {
                return new akzt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzt.a, "\u0001\u0003\u0001\u0000\ue059\u1967\uee40\u52d2\u0003\u0000\u0000\u0003\ue059\u1967\u143c\u0000\uffb8\u2e1c\u143c\u0000\uee40\u52d2\u143c\u0000", new Object[] { "c", "b", ankv.class, ankf.class, amot.class });
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
