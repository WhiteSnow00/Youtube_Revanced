import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzj extends agzi implements ahax
{
    public static final apzj a;
    private static volatile ahbe e;
    public int b;
    public aqta c;
    public aqsz d;
    
    static {
        agzi.registerDefaultInstance(apzj.class, a = new apzj());
    }
    
    private apzj() {
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
                if ((e = apzj.e) == null) {
                    synchronized (apzj.class) {
                        if (apzj.e == null) {
                            apzj.e = (ahbe)new agzb((agzi)apzj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apzj.a;
            }
            case 4: {
                return new agza((agzi)apzj.a);
            }
            case 3: {
                return new apzj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
