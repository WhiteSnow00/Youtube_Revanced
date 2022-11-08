import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzp extends agzi implements ahax
{
    private static final apzp a;
    private static volatile ahbe b;
    private int c;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apzp.class, a = new apzp());
    }
    
    private apzp() {
    }
    
    public static apzo a() {
        return (apzo)apzp.a.createBuilder();
    }
    
    private void d(final apqr apqr) {
        this.d = apqr.k;
        this.c |= 0x1;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apzp.b) == null) {
                    synchronized (apzp.class) {
                        if (apzp.b == null) {
                            apzp.b = (ahbe)new agzb((agzi)apzp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apzp.a;
            }
            case 4: {
                return new apzo();
            }
            case 3: {
                return new apzp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", apqr.a() });
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
