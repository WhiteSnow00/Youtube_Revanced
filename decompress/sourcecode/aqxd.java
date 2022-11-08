import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxd extends agzi implements ahax
{
    public static final aqxd a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public boolean f;
    
    static {
        agzi.registerDefaultInstance(aqxd.class, a = new aqxd());
    }
    
    private aqxd() {
        this.c = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aqxd.g) == null) {
                    synchronized (aqxd.class) {
                        if (aqxd.g == null) {
                            aqxd.g = (ahbe)new agzb((agzi)aqxd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqxd.a;
            }
            case 4: {
                return new agza((agzi)aqxd.a);
            }
            case 3: {
                return new aqxd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxd.a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u1007\f\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u1007\r\f\u103c\u0000\r\u103c\u0000\u000e\u103c\u0000", new Object[] { "d", "c", "b", aqxt.class, aqxr.class, aqws.class, aqvp.class, "e", aqvl.class, aqxy.class, aqxu.class, aqvs.class, aqyc.class, "f", aqvt.class, aqwq.class, aqvy.class });
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
