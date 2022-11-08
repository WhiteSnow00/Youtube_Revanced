import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appz extends agzi implements ahax
{
    public static final appz a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)appz.class, (agzi)(a = new appz()));
    }
    
    private appz() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = appz.d) == null) {
                    synchronized (appz.class) {
                        if (appz.d == null) {
                            appz.d = (ahbe)new agzb((agzi)appz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appz.a;
            }
            case 4: {
                return new agza((agzi)appz.a);
            }
            case 3: {
                return new appz();
            }
            case 2: {
                return newMessageInfo((MessageLite)appz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
