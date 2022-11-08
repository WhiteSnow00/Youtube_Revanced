import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdu extends agzi implements ahax
{
    public static final ajdu a;
    private static volatile ahbe n;
    public int b;
    public String c;
    public agzy d;
    public agzy e;
    public String f;
    public String g;
    public boolean h;
    public ajdr i;
    public String j;
    public agzy k;
    public ajdt l;
    public ajdt m;
    
    static {
        agzi.registerDefaultInstance(ajdu.class, a = new ajdu());
    }
    
    private ajdu() {
        this.c = "";
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        this.f = "";
        this.g = "";
        this.j = "";
        this.k = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe n;
                if ((n = ajdu.n) == null) {
                    synchronized (ajdu.class) {
                        if (ajdu.n == null) {
                            ajdu.n = (ahbe)new agzb((agzi)ajdu.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ajdu.a;
            }
            case 4: {
                return new agza((char[][])null, (boolean[][])null);
            }
            case 3: {
                return new ajdu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdu.a, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0003\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u001b\u0004\u1008\u0001\u0005\u1008\u0002\u0006\u1007\u0003\b\u1009\u0005\t\u1008\u0006\f\u001b\r\u1009\t\u000e\u1009\n", new Object[] { "b", "c", "d", ajdq.class, "e", ajdo.class, "f", "g", "h", "i", "j", "k", ajds.class, "l", "m" });
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
