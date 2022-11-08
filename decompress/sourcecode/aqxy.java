import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxy extends agzi implements ahax
{
    public static final aqxy a;
    private static volatile ahbe f;
    public int b;
    public aqvj c;
    public String d;
    public aqxz e;
    
    static {
        agzi.registerDefaultInstance(aqxy.class, a = new aqxy());
    }
    
    private aqxy() {
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
                final ahbe f;
                if ((f = aqxy.f) == null) {
                    synchronized (aqxy.class) {
                        if (aqxy.f == null) {
                            aqxy.f = (ahbe)new agzb((agzi)aqxy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqxy.a;
            }
            case 4: {
                return new agza((agzi)aqxy.a);
            }
            case 3: {
                return new aqxy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
