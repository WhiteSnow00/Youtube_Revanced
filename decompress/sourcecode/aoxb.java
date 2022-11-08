import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxb extends agzi implements ahax
{
    public static final aoxb a;
    private static volatile ahbe e;
    public agzy b;
    public agzy c;
    public boolean d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(aoxb.class, a = new aoxb());
    }
    
    private aoxb() {
        this.b = agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aoxb.e) == null) {
                    synchronized (aoxb.class) {
                        if (aoxb.e == null) {
                            aoxb.e = (ahbe)new agzb((agzi)aoxb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoxb.a;
            }
            case 4: {
                return new agza((agzi)aoxb.a);
            }
            case 3: {
                return new aoxb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoxb.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0003\u001a\u0004\u1007\u0000", new Object[] { "f", "b", ants.class, "c", "d" });
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
