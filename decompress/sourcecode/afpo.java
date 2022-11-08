import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpo extends agzi implements ahax
{
    public static final afpo a;
    private static volatile ahbe s;
    public int b;
    public int c;
    public int d;
    public afpm e;
    public long f;
    public afpz g;
    public afpt h;
    public afpn i;
    public afpy j;
    public afps k;
    public afpw l;
    public afpl m;
    public afpu n;
    public afpr o;
    public afpx p;
    public afpp q;
    public afpq r;
    
    static {
        agzi.registerDefaultInstance(afpo.class, a = new afpo());
    }
    
    private afpo() {
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe s;
                if ((s = afpo.s) == null) {
                    synchronized (afpo.class) {
                        if (afpo.s == null) {
                            afpo.s = (ahbe)new agzb((agzi)afpo.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return afpo.a;
            }
            case 4: {
                return new agza((agzi)afpo.a);
            }
            case 3: {
                return new afpo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpo.a, "\u0001\u000e\u0000\u0003\nH\u000e\u0000\u0000\u0000\n\u1009\b\u0015\u1002\u0013 \u1009\u001f(\u1009'.\u1009-0\u1009/1\u100903\u100936\u10096?\u1009?@\u1009@B\u1009BC\u1009CH\u1009\u0014", new Object[] { "b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "g" });
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
