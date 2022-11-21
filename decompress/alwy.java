import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwy extends ahcz implements aheo
{
    public static final alwy a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private aisc f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alwy.class, a = new alwy());
    }
    
    private alwy() {
        this.h = 2;
        final ahbt b = ahbt.b;
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
                if ((b = alwy.b) == null) {
                    synchronized (alwy.class) {
                        if (alwy.b == null) {
                            alwy.b = (ahev)new ahcs((ahcz)alwy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alwy.a;
            }
            case 4: {
                return new ahcr((ahcz)alwy.a);
            }
            case 3: {
                return new alwy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwy.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0005\u1409\u0002", new Object[] { "c", "d", "e", "g", "f" });
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
