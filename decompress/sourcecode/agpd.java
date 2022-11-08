import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpd extends agzi implements ahax
{
    public static final agpd a;
    private static volatile ahbe j;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    private int k;
    
    static {
        agzi.registerDefaultInstance(agpd.class, a = new agpd());
    }
    
    private agpd() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
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
                final ahbe j;
                if ((j = agpd.j) == null) {
                    synchronized (agpd.class) {
                        if (agpd.j == null) {
                            agpd.j = (ahbe)new agzb((agzi)agpd.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agpd.a;
            }
            case 4: {
                return new agza((agzi)agpd.a);
            }
            case 3: {
                return new agpd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpd.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1004\u0007", new Object[] { "k", "b", "c", "d", "e", "f", "g", "h", "i" });
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
