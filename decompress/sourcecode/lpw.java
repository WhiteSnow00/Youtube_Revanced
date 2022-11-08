import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpw extends agzi implements ahax
{
    public static final lpw a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agzq d;
    
    static {
        agzi.registerDefaultInstance(lpw.class, a = new lpw());
    }
    
    private lpw() {
        this.c = "";
        this.d = agzi.emptyIntList();
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
                if ((e = lpw.e) == null) {
                    synchronized (lpw.class) {
                        if (lpw.e == null) {
                            lpw.e = (ahbe)new agzb((agzi)lpw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return lpw.a;
            }
            case 4: {
                return new agza((agzi)lpw.a);
            }
            case 3: {
                return new lpw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u0016", new Object[] { "b", "c", "d" });
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
