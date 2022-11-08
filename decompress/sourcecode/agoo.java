import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoo extends agzi implements ahax
{
    public static final agoo a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public agpa d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(agoo.class, a = new agoo());
    }
    
    private agoo() {
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
                final ahbe f;
                if ((f = agoo.f) == null) {
                    synchronized (agoo.class) {
                        if (agoo.f == null) {
                            agoo.f = (ahbe)new agzb((agzi)agoo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agoo.a;
            }
            case 4: {
                return new agza((agzi)agoo.a);
            }
            case 3: {
                return new agoo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoo.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
