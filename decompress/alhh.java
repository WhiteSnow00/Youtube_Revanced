import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhh extends ahcz implements aheo
{
    public static final alhh a;
    private static volatile ahev j;
    public int b;
    public aknh c;
    public String d;
    public long e;
    public String f;
    public aifg g;
    public aoyk h;
    public String i;
    private alhb k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(alhh.class, a = new alhh());
    }
    
    private alhh() {
        this.l = 2;
        this.d = "";
        this.f = "";
        this.i = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = alhh.j) == null) {
                    synchronized (alhh.class) {
                        if (alhh.j == null) {
                            alhh.j = (ahev)new ahcs((ahcz)alhh.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alhh.a;
            }
            case 4: {
                return new ahcr((ahcz)alhh.a);
            }
            case 3: {
                return new alhh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhh.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1008\u0003\u0005\u1009\u0004\u0006\u1009\u0005\u0007\u1009\u0006\b\u1008\u0007", new Object[] { "b", "c", "d", "e", "f", "k", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
