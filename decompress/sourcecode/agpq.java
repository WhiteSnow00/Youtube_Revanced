import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpq extends agzi implements ahax
{
    public static final agpq a;
    private static volatile ahbe c;
    public ahas b;
    private ahas d;
    private ahas e;
    
    static {
        agzi.registerDefaultInstance(agpq.class, a = new agpq());
    }
    
    private agpq() {
        this.b = ahas.a;
        final ahas a = ahas.a;
        this.d = a;
        this.e = a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = agpq.c) == null) {
                    synchronized (agpq.class) {
                        if (agpq.c == null) {
                            agpq.c = (ahbe)new agzb((agzi)agpq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agpq.a;
            }
            case 4: {
                return new agza((agzi)agpq.a);
            }
            case 3: {
                return new agpq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpq.a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u0002\u0832\u00032", new Object[] { "b", agpn.a, "e", agpm.a, afon.i, "d", agpp.a });
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
