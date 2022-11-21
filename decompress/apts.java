import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apts extends ahcz implements aheo
{
    public static final apts a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apts.class, a = new apts());
    }
    
    private apts() {
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
                if ((d = apts.d) == null) {
                    synchronized (apts.class) {
                        if (apts.d == null) {
                            apts.d = (ahev)new ahcs((ahcz)apts.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apts.a;
            }
            case 4: {
                return new ahcr((ahcz)apts.a);
            }
            case 3: {
                return new apts();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apts.a, "\u0001\u0001\u0001\u0000\uf189\u383b\uf189\u383b\u0001\u0000\u0000\u0001\uf189\u383b\u143c\u0000", new Object[] { "c", "b", apuc.class });
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
