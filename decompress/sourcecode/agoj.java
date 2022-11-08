import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoj extends agzi implements ahax
{
    public static final agoj a;
    private static volatile ahbe f;
    public String b;
    public int c;
    public agnt d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(agoj.class, a = new agoj());
    }
    
    private agoj() {
        this.b = "";
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
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
                if ((f = agoj.f) == null) {
                    synchronized (agoj.class) {
                        if (agoj.f == null) {
                            agoj.f = (ahbe)new agzb((agzi)agoj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agoj.a;
            }
            case 4: {
                return new agza((agzi)agoj.a);
            }
            case 3: {
                return new agoj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoj.a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0004\t\u0005\f", new Object[] { "b", "c", "d", "e" });
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
