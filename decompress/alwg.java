import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwg extends ahcz implements aheo
{
    public static final alwg a;
    private static volatile ahev b;
    private int c;
    private aiet d;
    private ajws e;
    private aisc f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alwg.class, a = new alwg());
    }
    
    private alwg() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alwg.b) == null) {
                    synchronized (alwg.class) {
                        if (alwg.b == null) {
                            alwg.b = (ahev)new ahcs((ahcz)alwg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alwg.a;
            }
            case 4: {
                return new ahcr((ahcz)alwg.a);
            }
            case 3: {
                return new alwg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
