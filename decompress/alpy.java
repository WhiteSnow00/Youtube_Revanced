import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpy extends ahcz implements aheo
{
    public static final alpy a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alpy.class, a = new alpy());
    }
    
    private alpy() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alpy.b) == null) {
                    synchronized (alpy.class) {
                        if (alpy.b == null) {
                            alpy.b = (ahev)new ahcs((ahcz)alpy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpy.a;
            }
            case 4: {
                return new ahcr((ahcz)alpy.a);
            }
            case 3: {
                return new alpy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpy.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
