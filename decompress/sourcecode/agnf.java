import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnf extends agzi implements ahax
{
    public static final agnf a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public long d;
    public long e;
    
    static {
        agzi.registerDefaultInstance(agnf.class, a = new agnf());
    }
    
    private agnf() {
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
                final ahbe f;
                if ((f = agnf.f) == null) {
                    synchronized (agnf.class) {
                        if (agnf.f == null) {
                            agnf.f = (ahbe)new agzb((agzi)agnf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agnf.a;
            }
            case 4: {
                return new agza((agzi)agnf.a);
            }
            case 3: {
                return new agnf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnf.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
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
