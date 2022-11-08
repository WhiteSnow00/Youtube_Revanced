import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyh extends agzi implements ahax
{
    public static final jyh a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public int d;
    
    static {
        agzi.registerDefaultInstance((Class)jyh.class, (agzi)(a = new jyh()));
    }
    
    private jyh() {
        this.c = -1L;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = jyh.e) == null) {
                    synchronized (jyh.class) {
                        if (jyh.e == null) {
                            jyh.e = (ahbe)new agzb((agzi)jyh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return jyh.a;
            }
            case 4: {
                return new agza((agzi)jyh.a);
            }
            case 3: {
                return new jyh();
            }
            case 2: {
                return newMessageInfo((MessageLite)jyh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
