import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajww extends agzi implements ahax
{
    public static final ajww a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        agzi.registerDefaultInstance(ajww.class, a = new ajww());
    }
    
    private ajww() {
        this.b = agzi.emptyProtobufList();
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
                if ((d = ajww.d) == null) {
                    synchronized (ajww.class) {
                        if (ajww.d == null) {
                            ajww.d = (ahbe)new agzb((agzi)ajww.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajww.a;
            }
            case 4: {
                return new agza((agzi)ajww.a);
            }
            case 3: {
                return new ajww();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajww.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[] { "b", ajwv.class, "c", ajwu.class });
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
