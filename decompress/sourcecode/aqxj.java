import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxj extends agzi implements ahax
{
    private static final aqxj a;
    private static volatile ahbe b;
    private int c;
    private aqvd d;
    
    static {
        agzi.registerDefaultInstance(aqxj.class, a = new aqxj());
    }
    
    private aqxj() {
    }
    
    public static aqxi a() {
        return (aqxi)aqxj.a.createBuilder();
    }
    
    private void d(final aqvd d) {
        d.getClass();
        this.d = d;
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
                if ((b = aqxj.b) == null) {
                    synchronized (aqxj.class) {
                        if (aqxj.b == null) {
                            aqxj.b = (ahbe)new agzb((agzi)aqxj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqxj.a;
            }
            case 4: {
                return new aqxi();
            }
            case 3: {
                return new aqxj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
