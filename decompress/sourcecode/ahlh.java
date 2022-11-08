import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlh extends agzi implements ahax
{
    public static final ahlh a;
    private static volatile ahbe e;
    public String b;
    public int c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)ahlh.class, (agzi)(a = new ahlh()));
    }
    
    private ahlh() {
        this.b = "";
        this.d = 1;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahlh.e) == null) {
                    synchronized (ahlh.class) {
                        if (ahlh.e == null) {
                            ahlh.e = (ahbe)new agzb((agzi)ahlh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlh.a;
            }
            case 4: {
                return new agza((agzi)ahlh.a);
            }
            case 3: {
                return new ahlh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", ahnh.a(), "d" });
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
