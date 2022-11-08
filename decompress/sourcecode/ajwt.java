import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwt extends agzi implements ahax
{
    public static final ajwt a;
    private static volatile ahbe d;
    public String b;
    public agzy c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(ajwt.class, a = new ajwt());
    }
    
    private ajwt() {
        this.b = "";
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajwt.d) == null) {
                    synchronized (ajwt.class) {
                        if (ajwt.d == null) {
                            ajwt.d = (ahbe)new agzb((agzi)ajwt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajwt.a;
            }
            case 4: {
                return new agza((agzi)ajwt.a);
            }
            case 3: {
                return new ajwt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "e", "b", "c" });
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
