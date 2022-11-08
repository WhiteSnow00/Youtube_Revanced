import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqak extends agzi implements ahax
{
    public static final aqak a;
    private static volatile ahbe e;
    public int b;
    public aqpz c;
    public ahas d;
    
    static {
        agzi.registerDefaultInstance(aqak.class, a = new aqak());
    }
    
    private aqak() {
        this.d = ahas.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aqak.e) == null) {
                    synchronized (aqak.class) {
                        if (aqak.e == null) {
                            aqak.e = (ahbe)new agzb((agzi)aqak.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqak.a;
            }
            case 4: {
                return new agza((agzi)aqak.a);
            }
            case 3: {
                return new aqak();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqak.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1009\u0000\u00022", new Object[] { "b", "c", "d", aqaj.a });
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
