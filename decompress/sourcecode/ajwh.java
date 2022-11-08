import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwh extends agzd implements agze
{
    public static final ajwh a;
    private static volatile ahbe h;
    public int b;
    public Object c;
    public int d;
    public Object e;
    public String f;
    public String g;
    private int i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)ajwh.class, (agzi)(a = new ajwh()));
    }
    
    private ajwh() {
        this.b = 0;
        this.d = 0;
        this.j = 2;
        this.f = "";
        this.g = "";
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
                final ahbe h;
                if ((h = ajwh.h) == null) {
                    synchronized (ajwh.class) {
                        if (ajwh.h == null) {
                            ajwh.h = (ahbe)new agzb((agzi)ajwh.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajwh.a;
            }
            case 4: {
                return new agzc(ajwh.a);
            }
            case 3: {
                return new ajwh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajwh.a, "\u0001\u0006\u0002\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u103b\u0000\u0003\u103b\u0001\u0004\u1008\u0004\u0005\u1008\u0005\u0006\u103d\u0000\u0007\u103d\u0001", new Object[] { "c", "b", "e", "d", "i", "f", "g" });
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
