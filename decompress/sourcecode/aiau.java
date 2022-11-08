import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiau extends agzi implements ahax
{
    public static final aiau a;
    private static volatile ahbe i;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public agzq h;
    private int j;
    
    static {
        agzi.registerDefaultInstance((Class)aiau.class, (agzi)(a = new aiau()));
    }
    
    private aiau() {
        this.h = emptyIntList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = aiau.i) == null) {
                    synchronized (aiau.class) {
                        if (aiau.i == null) {
                            aiau.i = (ahbe)new agzb((agzi)aiau.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aiau.a;
            }
            case 4: {
                return new agza((agzi)aiau.a);
            }
            case 3: {
                return new aiau();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiau.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u0016", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
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
