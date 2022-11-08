import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajsq extends agzd implements agze
{
    public static final ajsq a;
    private static volatile ahbe g;
    public int b;
    public agzy c;
    public String d;
    public boolean e;
    public ajsr f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)ajsq.class, (agzi)(a = new ajsq()));
    }
    
    private ajsq() {
        this.h = 2;
        this.c = emptyProtobufList();
        this.d = "";
    }
    
    public final void a() {
        final agzy c = this.c;
        if (!c.c()) {
            this.c = agzi.mutableCopy(c);
        }
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
                if ((g = ajsq.g) == null) {
                    synchronized (ajsq.class) {
                        if (ajsq.g == null) {
                            ajsq.g = (ahbe)new agzb((agzi)ajsq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajsq.a;
            }
            case 4: {
                return new agzc(ajsq.a);
            }
            case 3: {
                return new ajsq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajsq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001\u041b\u0002\u1007\u0001\u0003\u1009\u0002\u0004\u1008\u0000", new Object[] { "b", "c", ajss.class, "e", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
