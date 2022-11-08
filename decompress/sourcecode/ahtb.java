import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtb extends agzi implements ahax
{
    public static final ahtb a;
    private static volatile ahbe o;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    
    static {
        agzi.registerDefaultInstance(ahtb.class, a = new ahtb());
    }
    
    private ahtb() {
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
                if ((o3 = ahtb.o) == null) {
                    synchronized (ahtb.class) {
                        if (ahtb.o == null) {
                            ahtb.o = (ahbe)new agzb((agzi)ahtb.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ahtb.a;
            }
            case 4: {
                return new agza((agzi)ahtb.a);
            }
            case 3: {
                return new ahtb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtb.a, "\u0001\f\u0000\u0001\u000e\u001d\f\u0000\u0000\u0000\u000e\u100c\r\u0012\u1007\u0011\u0013\u1007\u0012\u0014\u1007\u0013\u0015\u1007\u0014\u0016\u1007\u0015\u0017\u1007\u0016\u0018\u1007\u0017\u0019\u1007\u0018\u001a\u1007\u0019\u001b\u1007\u001a\u001d\u1007\u001c", new Object[] { "b", "c", ahse.d, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n" });
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
