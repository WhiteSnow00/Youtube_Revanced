import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosn extends agzi implements ahax
{
    public static final aosn a;
    private static volatile ahbe d;
    public long b;
    public String c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(aosn.class, a = new aosn());
    }
    
    private aosn() {
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
                final ahbe d;
                if ((d = aosn.d) == null) {
                    synchronized (aosn.class) {
                        if (aosn.d == null) {
                            aosn.d = (ahbe)new agzb((agzi)aosn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aosn.a;
            }
            case 4: {
                return new agza((agzi)aosn.a);
            }
            case 3: {
                return new aosn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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
