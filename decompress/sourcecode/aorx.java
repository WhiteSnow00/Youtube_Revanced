import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorx extends agzi implements ahax
{
    public static final aorx a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public String d;
    public agyc e;
    
    static {
        agzi.registerDefaultInstance(aorx.class, a = new aorx());
    }
    
    private aorx() {
        this.d = "";
        this.e = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aorx.f) == null) {
                    synchronized (aorx.class) {
                        if (aorx.f == null) {
                            aorx.f = (ahbe)new agzb((agzi)aorx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aorx.a;
            }
            case 4: {
                return new agza((agzi)aorx.a);
            }
            case 3: {
                return new aorx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u100a\u0002", new Object[] { "b", "c", "d", "e" });
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
