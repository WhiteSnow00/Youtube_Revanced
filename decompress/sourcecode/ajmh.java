import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmh extends agzi implements ahax
{
    public static final ajmh a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public ahfw d;
    public agyc e;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)ajmh.class, (agzi)(a = new ajmh()));
    }
    
    private ajmh() {
        this.j = 2;
        this.c = emptyProtobufList();
        emptyProtobufList();
        this.e = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ajmh.f) == null) {
                    synchronized (ajmh.class) {
                        if (ajmh.f == null) {
                            ajmh.f = (ahbe)new agzb((agzi)ajmh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajmh.a;
            }
            case 4: {
                return new agza((agzi)ajmh.a);
            }
            case 3: {
                return new ajmh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmh.a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0001\u0005\u0002\u041b\u0004\u1409\u0001\u0005\u1409\u0002\u0006\u1409\u0003\b\u1409\u000b\t\u100a\f", new Object[] { "b", "c", ajmg.class, "g", "h", "i", "d", "e" });
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
