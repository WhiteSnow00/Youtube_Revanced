import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnp extends agzi implements ahax
{
    public static final agnp a;
    private static volatile ahbe f;
    public agoj b;
    public String c;
    public agzy d;
    public agog e;
    
    static {
        agzi.registerDefaultInstance(agnp.class, a = new agnp());
    }
    
    private agnp() {
        this.c = "";
        this.d = agzi.emptyProtobufList();
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
                if ((f = agnp.f) == null) {
                    synchronized (agnp.class) {
                        if (agnp.f == null) {
                            agnp.f = (ahbe)new agzb((agzi)agnp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agnp.a;
            }
            case 4: {
                return new agza((agzi)agnp.a);
            }
            case 3: {
                return new agnp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnp.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\u0208\u0003\u021a\u0004\t", new Object[] { "b", "c", "d", "e" });
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
