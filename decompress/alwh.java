import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwh extends ahcz implements aheo
{
    public static final alwh a;
    private static volatile ahev b;
    private int c;
    private alwg d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alwh.class, a = new alwh());
    }
    
    private alwh() {
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
                if ((b = alwh.b) == null) {
                    synchronized (alwh.class) {
                        if (alwh.b == null) {
                            alwh.b = (ahev)new ahcs((ahcz)alwh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alwh.a;
            }
            case 4: {
                return new ahcr((ahcz)alwh.a);
            }
            case 3: {
                return new alwh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwh.a, "\u0001\u0001\u0000\u0001\uebc3\u2df5\uebc3\u2df5\u0001\u0000\u0000\u0001\uebc3\u2df5\u1409\u0000", new Object[] { "c", "d" });
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
