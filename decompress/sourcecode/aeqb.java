import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeqb extends agzi implements ahax
{
    public static final aeqb a;
    private static volatile ahbe e;
    public int b;
    public aeqa c;
    public aepz d;
    
    static {
        agzi.registerDefaultInstance(aeqb.class, a = new aeqb());
    }
    
    private aeqb() {
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
                if ((e = aeqb.e) == null) {
                    synchronized (aeqb.class) {
                        if (aeqb.e == null) {
                            aeqb.e = (ahbe)new agzb((agzi)aeqb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aeqb.a;
            }
            case 4: {
                return new agza((agzi)aeqb.a);
            }
            case 3: {
                return new aeqb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeqb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
