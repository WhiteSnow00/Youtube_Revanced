import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loy extends agzi implements ahax
{
    public static final loy a;
    private static volatile ahbe e;
    public int b;
    public agzq c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(loy.class, a = new loy());
    }
    
    private loy() {
        emptyIntList();
        this.c = agzi.emptyIntList();
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = loy.e) == null) {
                    synchronized (loy.class) {
                        if (loy.e == null) {
                            loy.e = (ahbe)new agzb((agzi)loy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return loy.a;
            }
            case 4: {
                return new agza((agzi)loy.a);
            }
            case 3: {
                return new loy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)loy.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u0016\u0003\u1008\u0000", new Object[] { "b", "c", "d" });
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
