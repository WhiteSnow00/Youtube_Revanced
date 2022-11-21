import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsk extends ahcz implements aheo
{
    public static final aqsk a;
    private static volatile ahev j;
    public int b;
    public long c;
    public ahbt d;
    public long e;
    public boolean f;
    public long g;
    public boolean h;
    public boolean i;
    
    static {
        ahcz.registerDefaultInstance(aqsk.class, a = new aqsk());
    }
    
    private aqsk() {
        this.c = -1L;
        this.d = ahbt.b;
        this.e = -1L;
        this.g = 10000L;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aqsk.j) == null) {
                    synchronized (aqsk.class) {
                        if (aqsk.j == null) {
                            aqsk.j = (ahev)new ahcs((ahcz)aqsk.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqsk.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsk.a);
            }
            case 3: {
                return new aqsk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsk.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u100a\u0001\u0003\u1002\u0002\u0004\u1007\u0003\u0005\u1002\u0004\u0006\u1007\u0005\u0007\u1007\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
