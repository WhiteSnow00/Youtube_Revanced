import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrj extends agzi implements ahax
{
    public static final agrj a;
    private static volatile ahbe e;
    public agrk b;
    public agzy c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(agrj.class, a = new agrj());
    }
    
    private agrj() {
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
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
                if ((e = agrj.e) == null) {
                    synchronized (agrj.class) {
                        if (agrj.e == null) {
                            agrj.e = (ahbe)new agzb((agzi)agrj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agrj.a;
            }
            case 4: {
                return new agza((agzi)agrj.a);
            }
            case 3: {
                return new agrj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agrj.a, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0004\t", new Object[] { "c", agre.class, "d", agri.class, "b" });
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
