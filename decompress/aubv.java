import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubv extends ahcz implements aheo
{
    public static final aubv a;
    private static volatile ahev b;
    private int c;
    private aubl d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aubv.class, a = new aubv());
    }
    
    private aubv() {
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
                if ((b = aubv.b) == null) {
                    synchronized (aubv.class) {
                        if (aubv.b == null) {
                            aubv.b = (ahev)new ahcs((ahcz)aubv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aubv.a;
            }
            case 4: {
                return new ahcr((ahcz)aubv.a);
            }
            case 3: {
                return new aubv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
