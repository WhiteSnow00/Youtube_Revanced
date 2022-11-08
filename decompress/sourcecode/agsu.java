import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsu extends agzi implements ahax
{
    public static final agsu a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agsu.class, a = new agsu());
    }
    
    private agsu() {
        this.c = "";
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
                if ((e = agsu.e) == null) {
                    synchronized (agsu.class) {
                        if (agsu.e == null) {
                            agsu.e = (ahbe)new agzb((agzi)agsu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agsu.a;
            }
            case 4: {
                return new agza((agzi)agsu.a);
            }
            case 3: {
                return new agsu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", afon.q });
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
