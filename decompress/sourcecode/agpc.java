import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpc extends agzi implements ahax
{
    public static final agpc a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public String d;
    public agzy e;
    
    static {
        agzi.registerDefaultInstance(agpc.class, a = new agpc());
    }
    
    private agpc() {
        this.c = "";
        this.d = "";
        this.e = agzi.emptyProtobufList();
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
                if ((f = agpc.f) == null) {
                    synchronized (agpc.class) {
                        if (agpc.f == null) {
                            agpc.f = (ahbe)new agzb((agzi)agpc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agpc.a;
            }
            case 4: {
                return new agza((agzi)agpc.a);
            }
            case 3: {
                return new agpc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", agpa.class });
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
