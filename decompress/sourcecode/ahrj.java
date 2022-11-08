import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrj extends agzi implements ahax
{
    public static final ahrj a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahrj.class, a = new ahrj());
    }
    
    private ahrj() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahrj.c) == null) {
                    synchronized (ahrj.class) {
                        if (ahrj.c == null) {
                            ahrj.c = (ahbe)new agzb((agzi)ahrj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahrj.a;
            }
            case 4: {
                return new agza((agzi)ahrj.a);
            }
            case 3: {
                return new ahrj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
