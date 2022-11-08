import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqu extends agzi implements ahax
{
    public static final ahqu a;
    private static volatile ahbe e;
    public boolean b;
    public agzy c;
    public boolean d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(ahqu.class, a = new ahqu());
    }
    
    private ahqu() {
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
                if ((e = ahqu.e) == null) {
                    synchronized (ahqu.class) {
                        if (ahqu.e == null) {
                            ahqu.e = (ahbe)new agzb((agzi)ahqu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahqu.a;
            }
            case 4: {
                return new agza((agzi)ahqu.a);
            }
            case 3: {
                return new ahqu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqu.a, "\u0001\u0003\u0000\u0001\r\u0010\u0003\u0000\u0001\u0000\r\u1007\u000b\u000e\u001a\u0010\u1007\r", new Object[] { "f", "b", "c", "d" });
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
