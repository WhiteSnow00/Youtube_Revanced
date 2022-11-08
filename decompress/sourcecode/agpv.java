import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpv extends agzi implements ahax
{
    public static final agpv a;
    private static volatile ahbe j;
    public int b;
    public agzy c;
    public int d;
    public String e;
    public agpx f;
    public agpy g;
    public String h;
    public boolean i;
    
    static {
        agzi.registerDefaultInstance(agpv.class, a = new agpv());
    }
    
    private agpv() {
        this.c = agzi.emptyProtobufList();
        this.e = "";
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
                if ((j = agpv.j) == null) {
                    synchronized (agpv.class) {
                        if (agpv.j == null) {
                            agpv.j = (ahbe)new agzb((agzi)agpv.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agpv.a;
            }
            case 4: {
                return new agza((agzi)agpv.a);
            }
            case 3: {
                return new agpv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpv.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u100c\u0000\u0003\u1008\u0001\u0004\u1009\u0002\u0005\u1009\u0003\u0006\u1008\u0004\u0007\u1007\u0005", new Object[] { "b", "c", agpw.class, "d", afon.j, "e", "f", "g", "h", "i" });
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
