import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyy extends agzi implements ahax
{
    public static final ajyy a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public int d;
    public int e;
    public agzy f;
    public agzy g;
    public int h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ajyy.class, a = new ajyy());
    }
    
    private ajyy() {
        this.j = 2;
        this.f = agzi.emptyProtobufList();
        this.g = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = ajyy.i) == null) {
                    synchronized (ajyy.class) {
                        if (ajyy.i == null) {
                            ajyy.i = (ahbe)new agzb((agzi)ajyy.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajyy.a;
            }
            case 4: {
                return new agza((agzi)ajyy.a);
            }
            case 3: {
                return new ajyy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyy.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0002\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u041b\u0005\u041b\u0006\u1004\u0003", new Object[] { "b", "c", "d", "e", "f", anss.class, "g", anss.class, "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
