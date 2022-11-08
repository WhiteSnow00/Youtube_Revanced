import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahei extends agzi implements ahax
{
    public static final ahei a;
    private static volatile ahbe k;
    public int b;
    public int c;
    public int d;
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    public int j;
    
    static {
        agzi.registerDefaultInstance(ahei.class, a = new ahei());
    }
    
    private ahei() {
        emptyIntList();
        this.e = "";
        this.g = "";
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = ahei.k) == null) {
                    synchronized (ahei.class) {
                        if (ahei.k == null) {
                            ahei.k = (ahbe)new agzb((agzi)ahei.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ahei.a;
            }
            case 4: {
                return new agza((agzi)ahei.a);
            }
            case 3: {
                return new ahei();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahei.a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u100c\u0001\u0005\u1008\u0003\u0006\u100c\u0004\u0007\u1008\u0005\b\u1008\u0006\u000b\u100c\t\f\u100c\n", new Object[] { "b", "c", aheb.a(), "d", aheb.a(), "e", "f", ahdz.a(), "g", "h", "i", ahec.a, "j", ahec.b });
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
