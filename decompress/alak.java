import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alak extends ahcz implements aheo
{
    public static final alak a;
    private static volatile ahev c;
    public ancq b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alak.class, a = new alak());
    }
    
    private alak() {
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
                final ahev c;
                if ((c = alak.c) == null) {
                    synchronized (alak.class) {
                        if (alak.c == null) {
                            alak.c = (ahev)new ahcs((ahcz)alak.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alak.a;
            }
            case 4: {
                return new ahcr((ahcz)alak.a);
            }
            case 3: {
                return new alak();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alak.a, "\u0001\u0001\u0000\u0001\uf2fb\u3f82\uf2fb\u3f82\u0001\u0000\u0000\u0001\uf2fb\u3f82\u1409\u0000", new Object[] { "d", "b" });
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
