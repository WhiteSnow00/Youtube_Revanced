import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcz extends agzi implements ahax
{
    public static final ajcz a;
    private static volatile ahbe i;
    public int b;
    public akbf c;
    public String d;
    public String e;
    public agzy f;
    public ahfw g;
    public agyc h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ajcz.class, a = new ajcz());
    }
    
    private ajcz() {
        this.j = 2;
        this.d = "";
        this.e = "";
        this.f = agzi.emptyProtobufList();
        this.h = agyc.b;
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
                if ((i = ajcz.i) == null) {
                    synchronized (ajcz.class) {
                        if (ajcz.i == null) {
                            ajcz.i = (ahbe)new agzb((agzi)ajcz.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajcz.a;
            }
            case 4: {
                return new agza((agzi)ajcz.a);
            }
            case 3: {
                return new ajcz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcz.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0003\u0001\u1008\u0002\u0002\u1409\u0003\u0003\u100a\u0004\u0004\u1008\u0001\u0005\u1409\u0000\u0006\u041b", new Object[] { "b", "e", "g", "h", "d", "c", "f", ajsq.class });
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
