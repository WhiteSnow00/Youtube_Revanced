import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmt extends agzi implements ahax
{
    public static final ajmt a;
    private static volatile ahbe d;
    public ajsq b;
    public aorm c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ajmt.class, (agzi)(a = new ajmt()));
    }
    
    private ajmt() {
        this.f = 2;
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
                final ahbe d;
                if ((d = ajmt.d) == null) {
                    synchronized (ajmt.class) {
                        if (ajmt.d == null) {
                            ajmt.d = (ahbe)new agzb((agzi)ajmt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajmt.a;
            }
            case 4: {
                return new agza((agzi)ajmt.a);
            }
            case 3: {
                return new ajmt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
