import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwa extends agzi implements ahax
{
    private static final aqwa a;
    private static volatile ahbe b;
    private int c;
    private aqxf d;
    
    static {
        agzi.registerDefaultInstance(aqwa.class, a = new aqwa());
    }
    
    private aqwa() {
    }
    
    public static /* synthetic */ aqwa a() {
        return aqwa.a;
    }
    
    public static aqwa b() {
        return aqwa.a;
    }
    
    private void e(final aqxf d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    public aqxf c() {
        aqxf aqxf;
        if ((aqxf = this.d) == null) {
            aqxf = aqxf.l();
        }
        return aqxf;
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
                if ((b = aqwa.b) == null) {
                    synchronized (aqwa.class) {
                        if (aqwa.b == null) {
                            aqwa.b = (ahbe)new agzb((agzi)aqwa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwa.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqwa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
