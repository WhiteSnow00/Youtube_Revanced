import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agps extends agzi implements ahax
{
    public static final agps a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public agpt d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(agps.class, a = new agps());
    }
    
    private agps() {
        this.f = 2;
        this.c = agzi.emptyProtobufList();
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
                final ahbe e;
                if ((e = agps.e) == null) {
                    synchronized (agps.class) {
                        if (agps.e == null) {
                            agps.e = (ahbe)new agzb((agzi)agps.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agps.a;
            }
            case 4: {
                return new agza((agzi)agps.a);
            }
            case 3: {
                return new agps();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agps.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002\u041b\u0003\u1409\u0001", new Object[] { "b", "c", agpr.class, "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
