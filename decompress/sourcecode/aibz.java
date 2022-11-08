import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibz extends agzi implements ahax
{
    public static final aibz a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)aibz.class, (agzi)(a = new aibz()));
    }
    
    private aibz() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aibz.d) == null) {
                    synchronized (aibz.class) {
                        if (aibz.d == null) {
                            aibz.d = (ahbe)new agzb((agzi)aibz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibz.a;
            }
            case 4: {
                return new agza((agzi)aibz.a);
            }
            case 3: {
                return new aibz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
