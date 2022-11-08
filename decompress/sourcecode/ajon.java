import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajon extends agzi implements ahax
{
    public static final ajon a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    private int g;
    
    static {
        agzi.registerDefaultInstance((Class)ajon.class, (agzi)(a = new ajon()));
    }
    
    private ajon() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ajon.f) == null) {
                    synchronized (ajon.class) {
                        if (ajon.f == null) {
                            ajon.f = (ahbe)new agzb((agzi)ajon.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajon.a;
            }
            case 4: {
                return new agza((agzi)ajon.a);
            }
            case 3: {
                return new ajon();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajon.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u1007\u0001\u0003\u1004\u0000\u0004\u1007\u0002\u0005\u100c\u0003", new Object[] { "g", "c", "b", "d", "e", ajbl.a() });
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
