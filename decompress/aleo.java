import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleo extends ahcz implements aheo
{
    public static final aleo a;
    private static volatile ahev d;
    public aknj b;
    public int c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aleo.class, a = new aleo());
    }
    
    private aleo() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aleo.d) == null) {
                    synchronized (aleo.class) {
                        if (aleo.d == null) {
                            aleo.d = (ahev)new ahcs((ahcz)aleo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aleo.a;
            }
            case 4: {
                return new ahcr((ahcz)aleo.a);
            }
            case 3: {
                return new aleo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aleo.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u100c\u0001", new Object[] { "e", "b", "c", akyi.p });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
