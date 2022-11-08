import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajri extends agzd implements agze
{
    public static final ajri a;
    private static volatile ahbe i;
    public int b;
    public akjd c;
    public String d;
    public String e;
    public String f;
    public ajrr g;
    public String h;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)ajri.class, (agzi)(a = new ajri()));
    }
    
    private ajri() {
        this.j = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.h = "";
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
                if ((i = ajri.i) == null) {
                    synchronized (ajri.class) {
                        if (ajri.i == null) {
                            ajri.i = (ahbe)new agzb((agzi)ajri.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajri.a;
            }
            case 4: {
                return new agzc(ajri.a);
            }
            case 3: {
                return new ajri();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajri.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1409\u0005\u0007\u1008\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
