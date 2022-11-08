import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwi extends agzi implements ahax
{
    private static final aqwi a;
    private static volatile ahbe b;
    private int c;
    private boolean d;
    
    static {
        agzi.registerDefaultInstance(aqwi.class, a = new aqwi());
    }
    
    private aqwi() {
    }
    
    public static aqwh a() {
        return (aqwh)aqwi.a.createBuilder();
    }
    
    private void d(final boolean d) {
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
                if ((b = aqwi.b) == null) {
                    synchronized (aqwi.class) {
                        if (aqwi.b == null) {
                            aqwi.b = (ahbe)new agzb((agzi)aqwi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwi.a;
            }
            case 4: {
                return new aqwh();
            }
            case 3: {
                return new aqwi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
