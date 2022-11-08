import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorc extends agzi implements ahax
{
    public static final aorc a;
    private static volatile ahbe g;
    public int b;
    public akbf c;
    public ajsq d;
    public int e;
    public int f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aorc.class, a = new aorc());
    }
    
    private aorc() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = aorc.g) == null) {
                    synchronized (aorc.class) {
                        if (aorc.g == null) {
                            aorc.g = (ahbe)new agzb((agzi)aorc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aorc.a;
            }
            case 4: {
                return new agza((agzi)aorc.a);
            }
            case 3: {
                return new aorc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorc.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1409\u0001\u0002\u100c\u0002\u0003\u100c\u0003\u0004\u1409\u0000", new Object[] { "b", "d", "e", aonj.p, "f", aonj.n, "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
