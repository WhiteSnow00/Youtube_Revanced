import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoq extends agzi implements ahax
{
    public static final agoq a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public String e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(agoq.class, a = new agoq());
    }
    
    private agoq() {
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
                final ahbe g;
                if ((g = agoq.g) == null) {
                    synchronized (agoq.class) {
                        if (agoq.g == null) {
                            agoq.g = (ahbe)new agzb((agzi)agoq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agoq.a;
            }
            case 4: {
                return new agza((agzi)agoq.a);
            }
            case 3: {
                return new agoq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agoq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u100c\u0003", new Object[] { "b", "c", afon.f, "d", afon.e, "e", "f", aqkf.r });
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
