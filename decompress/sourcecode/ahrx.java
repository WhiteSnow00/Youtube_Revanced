import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrx extends agzi implements ahax
{
    public static final ahrx a;
    private static volatile ahbe i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    private int j;
    
    static {
        agzi.registerDefaultInstance(ahrx.class, a = new ahrx());
    }
    
    private ahrx() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = ahrx.i) == null) {
                    synchronized (ahrx.class) {
                        if (ahrx.i == null) {
                            ahrx.i = (ahbe)new agzb((agzi)ahrx.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahrx.a;
            }
            case 4: {
                return new agza((agzi)ahrx.a);
            }
            case 3: {
                return new ahrx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrx.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\u1007\u0000\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006\t\u1007\b", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
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
