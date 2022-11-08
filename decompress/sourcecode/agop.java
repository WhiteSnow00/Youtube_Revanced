import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agop extends agzi implements ahax
{
    public static final agop a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(agop.class, a = new agop());
    }
    
    private agop() {
        this.c = "";
        this.d = agzi.emptyProtobufList();
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
                if ((e = agop.e) == null) {
                    synchronized (agop.class) {
                        if (agop.e == null) {
                            agop.e = (ahbe)new agzb((agzi)agop.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agop.a;
            }
            case 4: {
                return new agza((agzi)agop.a);
            }
            case 3: {
                return new agop();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agop.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "b", "c", "d", agoo.class });
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
