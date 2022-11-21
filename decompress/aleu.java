import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aleu extends ahcz implements aheo
{
    public static final aleu a;
    private static volatile ahev d;
    public int b;
    public aknh c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aleu.class, a = new aleu());
    }
    
    private aleu() {
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
                if ((d = aleu.d) == null) {
                    synchronized (aleu.class) {
                        if (aleu.d == null) {
                            aleu.d = (ahev)new ahcs((ahcz)aleu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aleu.a;
            }
            case 4: {
                return new ahcr((ahcz)aleu.a);
            }
            case 3: {
                return new aleu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aleu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
