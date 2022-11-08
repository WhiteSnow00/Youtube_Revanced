import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxt extends agzi implements ahax
{
    public static final ajxt a;
    private static volatile ahbe d;
    public int b;
    public String c;
    private ajsq e;
    private ajsq f;
    private ahfw g;
    private ajxu h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ajxt.class, a = new ajxt());
    }
    
    private ajxt() {
        this.i = 2;
        final agyc b = agyc.b;
        this.c = "";
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
                final ahbe d;
                if ((d = ajxt.d) == null) {
                    synchronized (ajxt.class) {
                        if (ajxt.d == null) {
                            ajxt.d = (ahbe)new agzb((agzi)ajxt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajxt.a;
            }
            case 4: {
                return new agza((agzi)ajxt.a);
            }
            case 3: {
                return new ajxt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxt.a, "\u0001\u0005\u0000\u0001\b\u0013\u0005\u0000\u0000\u0004\b\u1409\n\n\u1409\u0002\u000b\u1409\u0004\f\u1409\f\u0013\u1008\u0012", new Object[] { "b", "g", "e", "f", "h", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
