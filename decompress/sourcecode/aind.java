import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aind extends agzi implements ahax
{
    public static final aind a;
    private static volatile ahbe e;
    public String b;
    public String c;
    public String d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(aind.class, a = new aind());
    }
    
    private aind() {
        this.b = "";
        this.c = "";
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
                if ((e = aind.e) == null) {
                    synchronized (aind.class) {
                        if (aind.e == null) {
                            aind.e = (ahbe)new agzb((agzi)aind.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aind.a;
            }
            case 4: {
                return new agza((agzi)aind.a);
            }
            case 3: {
                return new aind();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aind.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "f", "b", "c", "d" });
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
