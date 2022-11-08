import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwv extends agzi implements ahax
{
    private static final aqwv a;
    private static volatile ahbe b;
    private int c;
    private aqwf d;
    
    static {
        agzi.registerDefaultInstance(aqwv.class, a = new aqwv());
    }
    
    private aqwv() {
    }
    
    public static /* synthetic */ aqwv b() {
        return aqwv.a;
    }
    
    public static aqwv c() {
        return aqwv.a;
    }
    
    public aqwf a() {
        aqwf aqwf;
        if ((aqwf = this.d) == null) {
            aqwf = aqwf.a;
        }
        return aqwf;
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
                if ((b = aqwv.b) == null) {
                    synchronized (aqwv.class) {
                        if (aqwv.b == null) {
                            aqwv.b = (ahbe)new agzb((agzi)aqwv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwv.a;
            }
            case 4: {
                return new agza((agzi)b());
            }
            case 3: {
                return new aqwv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
