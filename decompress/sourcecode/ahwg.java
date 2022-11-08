import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwg extends agzi implements ahax
{
    private static final ahwg a;
    private static volatile ahbe b;
    private int c;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahwg.class, a = new ahwg());
    }
    
    private ahwg() {
    }
    
    public static ahwf a() {
        return (ahwf)ahwg.a.createBuilder();
    }
    
    private void d(final int d) {
        this.c |= 0x1;
        this.d = d;
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
                if ((b = ahwg.b) == null) {
                    synchronized (ahwg.class) {
                        if (ahwg.b == null) {
                            ahwg.b = (ahbe)new agzb((agzi)ahwg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahwg.a;
            }
            case 4: {
                return new ahwf();
            }
            case 3: {
                return new ahwg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "c", "d" });
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
