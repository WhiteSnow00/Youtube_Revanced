import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxi extends agzi implements ahax
{
    public static final atxi a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public long d;
    public long e;
    public long f;
    
    static {
        agzi.registerDefaultInstance(atxi.class, a = new atxi());
    }
    
    private atxi() {
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
                final ahbe g;
                if ((g = atxi.g) == null) {
                    synchronized (atxi.class) {
                        if (atxi.g == null) {
                            atxi.g = (ahbe)new agzb((agzi)atxi.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return atxi.a;
            }
            case 4: {
                return new agza((agzi)atxi.a);
            }
            case 3: {
                return new atxi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxi.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
