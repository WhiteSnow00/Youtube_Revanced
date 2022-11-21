import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aico extends ahcz implements aheo
{
    public static final aico a;
    private static volatile ahev b;
    private int c;
    private aibv d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aico.class, a = new aico());
    }
    
    private aico() {
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
                final ahev b;
                if ((b = aico.b) == null) {
                    synchronized (aico.class) {
                        if (aico.b == null) {
                            aico.b = (ahev)new ahcs((ahcz)aico.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aico.a;
            }
            case 4: {
                return new ahcr((ahcz)aico.a);
            }
            case 3: {
                return new aico();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aico.a, "\u0001\u0001\u0000\u0001\ue384\u3020\ue384\u3020\u0001\u0000\u0000\u0001\ue384\u3020\u1409\u0000", new Object[] { "c", "d" });
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
