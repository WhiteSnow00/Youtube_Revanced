import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyu extends agzi implements ahax
{
    public static final ajyu a;
    private static volatile ahbe e;
    public int b;
    public agyc c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(ajyu.class, a = new ajyu());
    }
    
    private ajyu() {
        this.c = agyc.b;
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
                if ((e = ajyu.e) == null) {
                    synchronized (ajyu.class) {
                        if (ajyu.e == null) {
                            ajyu.e = (ahbe)new agzb((agzi)ajyu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajyu.a;
            }
            case 4: {
                return new agza((agzi)ajyu.a);
            }
            case 3: {
                return new ajyu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
