import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqy extends agzi implements ahax
{
    public static final agqy a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public long d;
    public agqs e;
    
    static {
        agzi.registerDefaultInstance(agqy.class, a = new agqy());
    }
    
    private agqy() {
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
                if ((f = agqy.f) == null) {
                    synchronized (agqy.class) {
                        if (agqy.f == null) {
                            agqy.f = (ahbe)new agzb((agzi)agqy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agqy.a;
            }
            case 4: {
                return new agza((agzi)agqy.a);
            }
            case 3: {
                return new agqy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1009\u0002", new Object[] { "b", "c", aqkf.t, "d", "e" });
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
