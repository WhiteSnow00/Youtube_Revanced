import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akww extends ahcz implements aheo
{
    public static final akww a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akww.class, a = new akww());
    }
    
    private akww() {
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
                if ((d = akww.d) == null) {
                    synchronized (akww.class) {
                        if (akww.d == null) {
                            akww.d = (ahev)new ahcs((ahcz)akww.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akww.a;
            }
            case 4: {
                return new ahcr((ahcz)akww.a);
            }
            case 3: {
                return new akww();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akww.a, "\u0001\u0002\u0001\u0000\ue1ae\u38da\ufeb7\u40e2\u0002\u0000\u0000\u0002\ue1ae\u38da\u143c\u0000\ufeb7\u40e2\u143c\u0000", new Object[] { "c", "b", aopk.class, aopg.class });
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
