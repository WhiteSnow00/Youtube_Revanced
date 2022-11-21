import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algo extends ahcz implements aheo
{
    public static final algo a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algo.class, a = new algo());
    }
    
    private algo() {
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
                if ((d = algo.d) == null) {
                    synchronized (algo.class) {
                        if (algo.d == null) {
                            algo.d = (ahev)new ahcs((ahcz)algo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algo.a;
            }
            case 4: {
                return new ahcr((ahcz)algo.a);
            }
            case 3: {
                return new algo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algo.a, "\u0001\u0001\u0001\u0000\ue53c\u2847\ue53c\u2847\u0001\u0000\u0000\u0001\ue53c\u2847\u143c\u0000", new Object[] { "c", "b", aorz.class });
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
