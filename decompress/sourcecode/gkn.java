import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkn extends agzi implements ahax
{
    public static final gkn a;
    private static volatile ahbe i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public boolean g;
    public boolean h;
    
    static {
        agzi.registerDefaultInstance(gkn.class, a = new gkn());
    }
    
    private gkn() {
        this.f = "APPEARANCE_SYSTEM";
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
                if ((i = gkn.i) == null) {
                    synchronized (gkn.class) {
                        if (gkn.i == null) {
                            gkn.i = (ahbe)new agzb((agzi)gkn.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return gkn.a;
            }
            case 4: {
                return new agza((agzi)gkn.a);
            }
            case 3: {
                return new gkn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)gkn.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1008\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
