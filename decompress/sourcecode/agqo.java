import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqo extends agzi implements ahax
{
    public static final agqo a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(agqo.class, a = new agqo());
    }
    
    private agqo() {
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
                if ((e = agqo.e) == null) {
                    synchronized (agqo.class) {
                        if (agqo.e == null) {
                            agqo.e = (ahbe)new agzb((agzi)agqo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqo.a;
            }
            case 4: {
                return new agza((agzi)agqo.a);
            }
            case 3: {
                return new agqo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
