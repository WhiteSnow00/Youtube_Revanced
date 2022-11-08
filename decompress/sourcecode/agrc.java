import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrc extends agzi implements ahax
{
    public static final agrc a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public String d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(agrc.class, a = new agrc());
    }
    
    private agrc() {
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
                final ahbe f;
                if ((f = agrc.f) == null) {
                    synchronized (agrc.class) {
                        if (agrc.f == null) {
                            agrc.f = (ahbe)new agzb((agzi)agrc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agrc.a;
            }
            case 4: {
                return new agza((agzi)agrc.a);
            }
            case 3: {
                return new agrc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agrc.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u100c\u0000\u0003\u1008\u0001\u0004\u100c\u0002", new Object[] { "b", "c", aqkf.r, "d", "e", aqkf.s });
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
