import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajng extends agzi implements ahax
{
    public static final ajng a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public String d;
    
    static {
        agzi.registerDefaultInstance((Class)ajng.class, (agzi)(a = new ajng()));
    }
    
    private ajng() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ajng.e) == null) {
                    synchronized (ajng.class) {
                        if (ajng.e == null) {
                            ajng.e = (ahbe)new agzb((agzi)ajng.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajng.a;
            }
            case 4: {
                return new agza((agzi)ajng.a);
            }
            case 3: {
                return new ajng();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajng.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u1008\u0001", new Object[] { "b", "c", ajnf.a(), "d" });
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
