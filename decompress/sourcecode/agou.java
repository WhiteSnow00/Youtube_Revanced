import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agou extends agzi implements ahax
{
    public static final agou a;
    private static volatile ahbe e;
    public int b;
    public agor c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(agou.class, a = new agou());
    }
    
    private agou() {
        this.d = "";
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
                if ((e = agou.e) == null) {
                    synchronized (agou.class) {
                        if (agou.e == null) {
                            agou.e = (ahbe)new agzb((agzi)agou.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agou.a;
            }
            case 4: {
                return new agza((agzi)agou.a);
            }
            case 3: {
                return new agou();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agou.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
