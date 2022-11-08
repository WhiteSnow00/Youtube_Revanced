import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpl extends agzi implements ahax
{
    public static final agpl a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public String e;
    private ahas g;
    
    static {
        agzi.registerDefaultInstance(agpl.class, a = new agpl());
    }
    
    private agpl() {
        this.g = ahas.a;
        this.e = "";
        emptyProtobufList();
        emptyProtobufList();
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
                if ((f = agpl.f) == null) {
                    synchronized (agpl.class) {
                        if (agpl.f == null) {
                            agpl.f = (ahbe)new agzb((agzi)agpl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agpl.a;
            }
            case 4: {
                return new agza((agzi)agpl.a);
            }
            case 3: {
                return new agpl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpl.a, "\u0001\u0004\u0000\u0001\u0006\u0010\u0004\u0001\u0000\u0000\u0006\u1004\u0005\u0007\u1004\u0006\b2\u0010\u1008\u000e", new Object[] { "b", "c", "d", "g", agpk.a, "e" });
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
