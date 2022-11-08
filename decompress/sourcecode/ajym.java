import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajym extends agzi implements ahax
{
    public static final ajym a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(ajym.class, a = new ajym());
    }
    
    private ajym() {
        this.c = "";
        this.d = "";
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
                if ((e = ajym.e) == null) {
                    synchronized (ajym.class) {
                        if (ajym.e == null) {
                            ajym.e = (ahbe)new agzb((agzi)ajym.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajym.a;
            }
            case 4: {
                return new agza((agzi)ajym.a);
            }
            case 3: {
                return new ajym();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajym.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
