import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomj extends agzi implements ahax
{
    public static final aomj a;
    private static volatile ahbe f;
    public int b;
    public agzq c;
    public int d;
    public int e;
    private int g;
    
    static {
        agzi.registerDefaultInstance((Class)aomj.class, (agzi)(a = new aomj()));
    }
    
    private aomj() {
        this.c = emptyIntList();
        this.d = 1;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aomj.f) == null) {
                    synchronized (aomj.class) {
                        if (aomj.f == null) {
                            aomj.f = (ahbe)new agzb((agzi)aomj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aomj.a;
            }
            case 4: {
                return new agza((agzi)aomj.a);
            }
            case 3: {
                return new aomj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1004\u0000\u0002'\u0003\u100c\u0001\u0004\u1004\u0002", new Object[] { "g", "b", "c", "d", aoiz.n, "e" });
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
