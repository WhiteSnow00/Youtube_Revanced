import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfm extends agzi implements ahax
{
    private static final agfm a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private int e;
    
    static {
        agzi.registerDefaultInstance(agfm.class, a = new agfm());
    }
    
    private agfm() {
    }
    
    public static agfl a() {
        return (agfl)agfm.a.createBuilder();
    }
    
    private void e(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final agfk agfk) {
        this.e = agfk.g;
        this.c |= 0x2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agfm.b) == null) {
                    synchronized (agfm.class) {
                        if (agfm.b == null) {
                            agfm.b = (ahbe)new agzb((agzi)agfm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agfm.a;
            }
            case 4: {
                return new agfl();
            }
            case 3: {
                return new agfm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100c\u0001", new Object[] { "c", "d", "e", agfk.b() });
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
