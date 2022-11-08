import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahps extends agzi implements ahax
{
    public static final ahps a;
    private static volatile ahbe l;
    public int b;
    public ahpr c;
    public long d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public ahpt i;
    public boolean j;
    public long k;
    
    static {
        agzi.registerDefaultInstance(ahps.class, a = new ahps());
    }
    
    private ahps() {
        this.f = "";
        this.g = "";
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
                final ahbe l;
                if ((l = ahps.l) == null) {
                    synchronized (ahps.class) {
                        if (ahps.l == null) {
                            ahps.l = (ahbe)new agzb((agzi)ahps.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ahps.a;
            }
            case 4: {
                return new agza((agzi)ahps.a);
            }
            case 3: {
                return new ahps();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahps.a, "\u0001\t\u0000\u0001\u0001\u0012\t\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0006\u1007\u0004\b\u1008\u0006\t\u1008\u0007\u000e\u1007\u000b\u000f\u1009\f\u0011\u1007\r\u0012\u1002\u000e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
