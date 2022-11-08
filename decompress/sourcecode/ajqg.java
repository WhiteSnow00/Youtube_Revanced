import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqg extends agzd implements agze
{
    public static final ajqg a;
    private static volatile ahbe j;
    public int b;
    public int c;
    public Object d;
    public aioe e;
    public ajsq f;
    public ajsq g;
    public ajqh h;
    public agzy i;
    private ajsq k;
    private amer m;
    private ajqf n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)ajqg.class, (agzi)(a = new ajqg()));
    }
    
    private ajqg() {
        this.c = 0;
        this.p = 2;
        emptyProtobufList();
        emptyProtobufList();
        this.i = emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe j;
                if ((j = ajqg.j) == null) {
                    synchronized (ajqg.class) {
                        if (ajqg.j == null) {
                            ajqg.j = (ahbe)new agzb((agzi)ajqg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajqg.a;
            }
            case 4: {
                return new agzc(ajqg.a);
            }
            case 3: {
                return new ajqg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajqg.a, "\u0001\u000b\u0001\u0001\u0001\u000f\u000b\u0000\u0001\u000b\u0001\u143c\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\b\u1409\t\t\u1409\u000b\n\u1409\u0007\r\u1409\b\u000e\u143c\u0000\u000f\u041b", new Object[] { "d", "c", "b", aorm.class, "e", "f", "k", "g", "n", "o", "h", "m", akbf.class, "i", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
