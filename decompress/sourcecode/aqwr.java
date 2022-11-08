import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwr extends agzi implements ahax
{
    public static final agzr a;
    public static final aqwr b;
    private static volatile ahbe f;
    public int c;
    public int d;
    public agzq e;
    
    static {
        a = (agzr)new altr(18);
        agzi.registerDefaultInstance(aqwr.class, b = new aqwr());
    }
    
    private aqwr() {
        this.e = agzi.emptyIntList();
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
                if ((f = aqwr.f) == null) {
                    synchronized (aqwr.class) {
                        if (aqwr.f == null) {
                            aqwr.f = (ahbe)new agzb((agzi)aqwr.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqwr.b;
            }
            case 4: {
                return new agza((byte[][])null, (short[][])null);
            }
            case 3: {
                return new aqwr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwr.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", aqwt.a(), "e", aqwt.a() });
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
