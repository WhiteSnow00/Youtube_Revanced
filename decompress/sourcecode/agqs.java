import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqs extends agzi implements ahax
{
    public static final agqs a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public agqz e;
    
    static {
        agzi.registerDefaultInstance(agqs.class, a = new agqs());
    }
    
    private agqs() {
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
                if ((f = agqs.f) == null) {
                    synchronized (agqs.class) {
                        if (agqs.f == null) {
                            agqs.f = (ahbe)new agzb((agzi)agqs.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agqs.a;
            }
            case 4: {
                return new agza((agzi)agqs.a);
            }
            case 3: {
                return new agqs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqs.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1009\u0002", new Object[] { "b", "c", agsq.b(), "d", aqkf.n, "e" });
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
