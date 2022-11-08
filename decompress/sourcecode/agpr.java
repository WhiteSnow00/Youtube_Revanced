import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpr extends agzi implements ahax
{
    public static final agzr a;
    public static final agpr b;
    private static volatile ahbe j;
    public int c;
    public String d;
    public int e;
    public agzq f;
    public agpl g;
    public agpj h;
    public agpv i;
    private byte k;
    
    static {
        a = (agzr)new prz(6);
        agzi.registerDefaultInstance(agpr.class, b = new agpr());
    }
    
    private agpr() {
        this.k = 2;
        this.d = "";
        this.f = agzi.emptyIntList();
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
                final ahbe j;
                if ((j = agpr.j) == null) {
                    synchronized (agpr.class) {
                        if (agpr.j == null) {
                            agpr.j = (ahbe)new agzb((agzi)agpr.b);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agpr.b;
            }
            case 4: {
                return new agza((agzi)agpr.b);
            }
            case 3: {
                return new agpr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpr.b, "\u0001\u0006\u0000\u0001\u0001\u001c\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u001e\u0005\u1009\u0002\n\u1009\u0007\u001c\u1009\u0019", new Object[] { "c", "d", "e", ahec.i, "f", ahfs.a(), "g", "h", "i" });
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
