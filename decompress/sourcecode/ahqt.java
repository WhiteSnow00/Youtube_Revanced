import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqt extends agzi implements ahax
{
    public static final ahqt a;
    private static volatile ahbe o;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public agzy f;
    public boolean g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    
    static {
        agzi.registerDefaultInstance(ahqt.class, a = new ahqt());
    }
    
    private ahqt() {
        this.f = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = ahqt.o) == null) {
                    synchronized (ahqt.class) {
                        if (ahqt.o == null) {
                            ahqt.o = (ahbe)new agzb((agzi)ahqt.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ahqt.a;
            }
            case 4: {
                return new agza((agzi)ahqt.a);
            }
            case 3: {
                return new ahqt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqt.a, "\u0001\f\u0000\u0001\u0004\u001a\f\u0000\u0001\u0000\u0004\u100c\u0003\u0006\u1007\u0004\u0007\u1004\u0005\t\u001b\n\u1007\b\f\u1001\n\u0012\u1007\u0011\u0015\u1007\u0014\u0017\u1007\u0015\u0018\u1001\u000b\u0019\u1007\u0016\u001a\u1007\u0017", new Object[] { "b", "c", ahng.n, "d", "e", "f", ahqs.class, "g", "h", "j", "k", "l", "i", "m", "n" });
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
