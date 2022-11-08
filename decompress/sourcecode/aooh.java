import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooh extends agzi implements ahax
{
    public static final aooh a;
    private static volatile ahbe m;
    public int b;
    public int c;
    public aoof d;
    public aooe e;
    public agyc f;
    public aoob g;
    public agzy h;
    public ahpz i;
    public aoqk j;
    public aooa k;
    public aood l;
    
    static {
        agzi.registerDefaultInstance((Class)aooh.class, (agzi)(a = new aooh()));
    }
    
    private aooh() {
        this.f = agyc.b;
        this.h = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe m;
                if ((m = aooh.m) == null) {
                    synchronized (aooh.class) {
                        if (aooh.m == null) {
                            aooh.m = (ahbe)new agzb((agzi)aooh.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aooh.a;
            }
            case 4: {
                return new agza((byte[])null, (boolean[])null);
            }
            case 3: {
                return new aooh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aooh.a, "\u0001\n\u0000\u0001\u0001\u0014\n\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u100a\u0003\t\u1009\u0006\n\u001b\f\u1009\b\u0012\u1009\r\u0013\u1009\u000e\u0014\u1009\u000f", new Object[] { "b", "c", aooi.a(), "d", "e", "f", "g", "h", ajbj.class, "i", "j", "k", "l" });
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
