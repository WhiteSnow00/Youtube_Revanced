import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvo extends agzi implements ahax
{
    public static final agzr a;
    public static final aqvo b;
    private static volatile ahbe f;
    public int c;
    public int d;
    public agzq e;
    
    static {
        a = (agzr)new altr(16);
        agzi.registerDefaultInstance(aqvo.class, b = new aqvo());
    }
    
    private aqvo() {
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
                if ((f = aqvo.f) == null) {
                    synchronized (aqvo.class) {
                        if (aqvo.f == null) {
                            aqvo.f = (ahbe)new agzb((agzi)aqvo.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqvo.b;
            }
            case 4: {
                return new agza((boolean[])null, (char[])null);
            }
            case 3: {
                return new aqvo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvo.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", aqvr.a(), "e", aqvr.a() });
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
