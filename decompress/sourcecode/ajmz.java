import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmz extends agzi implements ahax
{
    public static final ajmz a;
    private static volatile ahbe g;
    public agzy b;
    public long c;
    public agzy d;
    public boolean e;
    public agyc f;
    private int h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)ajmz.class, (agzi)(a = new ajmz()));
    }
    
    private ajmz() {
        this.j = 2;
        this.b = emptyProtobufList();
        this.d = emptyProtobufList();
        this.f = agyc.b;
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
                final ahbe g;
                if ((g = ajmz.g) == null) {
                    synchronized (ajmz.class) {
                        if (ajmz.g == null) {
                            ajmz.g = (ahbe)new agzb((agzi)ajmz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajmz.a;
            }
            case 4: {
                return new agza((agzi)ajmz.a);
            }
            case 3: {
                return new ajmz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmz.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0002\u0001\u041b\u0002\u1002\u0000\u0003\u001b\u0004\u1007\u0001\u0005\u1409\u0002\u0006\u100a\u0003", new Object[] { "h", "b", ajmy.class, "c", "d", alud.class, "e", "i", "f" });
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
