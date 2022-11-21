import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpl extends ahcz implements aheo
{
    public static final alpl a;
    private static volatile ahev b;
    private int c;
    private aqgs d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alpl.class, a = new alpl());
    }
    
    private alpl() {
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
                if ((b = alpl.b) == null) {
                    synchronized (alpl.class) {
                        if (alpl.b == null) {
                            alpl.b = (ahev)new ahcs((ahcz)alpl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alpl.a;
            }
            case 4: {
                return new ahcr((ahcz)alpl.a);
            }
            case 3: {
                return new alpl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
