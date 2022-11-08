import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovg extends agzi implements ahax
{
    public static final aovg a;
    private static volatile ahbe i;
    public ajsq b;
    public int c;
    public int d;
    public int e;
    public int f;
    public anss g;
    public boolean h;
    private int j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aovg.class, a = new aovg());
    }
    
    private aovg() {
        this.k = 2;
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
                final ahbe i;
                if ((i = aovg.i) == null) {
                    synchronized (aovg.class) {
                        if (aovg.i == null) {
                            aovg.i = (ahbe)new agzb((agzi)aovg.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aovg.a;
            }
            case 4: {
                return new agza((agzi)aovg.a);
            }
            case 3: {
                return new aovg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovg.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u1409\u0005\u0007\u1007\u0006", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
