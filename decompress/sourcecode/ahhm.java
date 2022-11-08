import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhm extends agzi implements ahax
{
    public static final ahhm a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public ahuf e;
    
    static {
        agzi.registerDefaultInstance(ahhm.class, a = new ahhm());
    }
    
    private ahhm() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahhm.f) == null) {
                    synchronized (ahhm.class) {
                        if (ahhm.f == null) {
                            ahhm.f = (ahbe)new agzb((agzi)ahhm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahhm.a;
            }
            case 4: {
                return new agza((agzi)ahhm.a);
            }
            case 3: {
                return new ahhm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhm.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0004\u1009\u0003", new Object[] { "b", "c", ahec.u, "d", ahec.t, "e" });
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
