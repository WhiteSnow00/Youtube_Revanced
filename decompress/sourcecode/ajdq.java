import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdq extends agzi implements ahax
{
    public static final ajdq a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public int d;
    public String e;
    public int f;
    public boolean g;
    
    static {
        agzi.registerDefaultInstance(ajdq.class, a = new ajdq());
    }
    
    private ajdq() {
        this.c = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ajdq.h) == null) {
                    synchronized (ajdq.class) {
                        if (ajdq.h == null) {
                            ajdq.h = (ahbe)new agzb((agzi)ajdq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajdq.a;
            }
            case 4: {
                return new agza((agzi)ajdq.a);
            }
            case 3: {
                return new ajdq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdq.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u100c\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", amuv.a(), "e", "f", amum.a(), "g" });
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
