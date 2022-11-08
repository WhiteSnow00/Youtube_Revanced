import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmj extends agzi implements ahax
{
    public static final ajmj a;
    private static volatile ahbe i;
    public int b;
    public String c;
    public ajsq d;
    public agzy e;
    public aioe f;
    public ahfw g;
    public agyc h;
    private ajsq j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)ajmj.class, (agzi)(a = new ajmj()));
    }
    
    private ajmj() {
        this.k = 2;
        this.c = "";
        emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = ajmj.i) == null) {
                    synchronized (ajmj.class) {
                        if (ajmj.i == null) {
                            ajmj.i = (ahbe)new agzb((agzi)ajmj.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajmj.a;
            }
            case 4: {
                return new agza((agzi)ajmj.a);
            }
            case 3: {
                return new ajmj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmj.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0004\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0004\u0007\u1409\u0005\b\u100a\u0006\t\u001a", new Object[] { "b", "c", "d", "j", "f", "g", "h", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
