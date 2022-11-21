import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almz extends ahcz implements aheo
{
    public static final almz a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(almz.class, a = new almz());
    }
    
    private almz() {
        this.e = 2;
        final ahbt b = ahbt.b;
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
                if ((b = almz.b) == null) {
                    synchronized (almz.class) {
                        if (almz.b == null) {
                            almz.b = (ahev)new ahcs((ahcz)almz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almz.a;
            }
            case 4: {
                return new ahcr((ahcz)almz.a);
            }
            case 3: {
                return new almz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
