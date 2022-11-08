import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyb extends agzi implements ahax
{
    public static final apyb a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(apyb.class, a = new apyb());
    }
    
    private apyb() {
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
                if ((e = apyb.e) == null) {
                    synchronized (apyb.class) {
                        if (apyb.e == null) {
                            apyb.e = (ahbe)new agzb((agzi)apyb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apyb.a;
            }
            case 4: {
                return new agza((agzi)apyb.a);
            }
            case 3: {
                return new apyb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aqkf.h });
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
