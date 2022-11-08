import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvk extends agzi implements ahax
{
    public static final agzr a;
    public static final aqvk b;
    private static volatile ahbe f;
    public int c;
    public int d;
    public agzq e;
    
    static {
        a = (agzr)new altr(15);
        agzi.registerDefaultInstance(aqvk.class, b = new aqvk());
    }
    
    private aqvk() {
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
                if ((f = aqvk.f) == null) {
                    synchronized (aqvk.class) {
                        if (aqvk.f == null) {
                            aqvk.f = (ahbe)new agzb((agzi)aqvk.b);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqvk.b;
            }
            case 4: {
                return new agza((boolean[][][])null, (int[])null);
            }
            case 3: {
                return new aqvk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvk.b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001e", new Object[] { "c", "d", aqvm.a(), "e", aqvm.a() });
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
