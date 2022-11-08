import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxt extends agzi implements ahax
{
    public static final aqxt a;
    private static volatile ahbe m;
    public int b;
    public String c;
    public String d;
    public ahdu e;
    public ahdu f;
    public aqvj g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public agzy l;
    
    static {
        agzi.registerDefaultInstance(aqxt.class, a = new aqxt());
    }
    
    private aqxt() {
        this.c = "";
        this.d = "";
        final agyc b = agyc.b;
        this.l = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe m;
                if ((m = aqxt.m) == null) {
                    synchronized (aqxt.class) {
                        if (aqxt.m == null) {
                            aqxt.m = (ahbe)new agzb((agzi)aqxt.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aqxt.a;
            }
            case 4: {
                return new agza((boolean[])null, (int[][])null);
            }
            case 3: {
                return new aqxt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxt.a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0000\u0001\u1008\u0000\u0005\u1008\u0002\u0006\u1009\u0003\u0007\u1009\u0004\b\u1009\u0007\t\u100c\b\n\u100c\t\u000b\u1001\n\u000f\u1007\u000e\u0011\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", aqvf.a(), "i", aqwc.a(), "j", "k", "l", aqxs.class });
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
