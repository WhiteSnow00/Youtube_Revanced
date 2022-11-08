import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtg extends agzi implements ahax
{
    public static final agtg a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public long d;
    public String e;
    public long f;
    
    static {
        agzi.registerDefaultInstance(agtg.class, a = new agtg());
    }
    
    private agtg() {
        this.c = "";
        this.e = "";
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
                if ((g = agtg.g) == null) {
                    synchronized (agtg.class) {
                        if (agtg.g == null) {
                            agtg.g = (ahbe)new agzb((agzi)agtg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agtg.a;
            }
            case 4: {
                return new agza((agzi)agtg.a);
            }
            case 3: {
                return new agtg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtg.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0003\u0003\u1002\u0002\u0004\u1002\u0004", new Object[] { "b", "c", "e", "d", "f" });
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
