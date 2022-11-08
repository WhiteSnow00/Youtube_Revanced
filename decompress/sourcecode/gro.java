import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gro extends agzi implements ahax
{
    public static final gro a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public String d;
    public agzq e;
    
    static {
        agzi.registerDefaultInstance((Class)gro.class, (agzi)(a = new gro()));
    }
    
    private gro() {
        this.d = "";
        this.e = emptyIntList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = gro.f) == null) {
                    synchronized (gro.class) {
                        if (gro.f == null) {
                            gro.f = (ahbe)new agzb((agzi)gro.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return gro.a;
            }
            case 4: {
                return new agza((agzi)gro.a);
            }
            case 3: {
                return new gro();
            }
            case 2: {
                return newMessageInfo((MessageLite)gro.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1008\u0001\u0003\u0016", new Object[] { "b", "c", "d", "e" });
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
