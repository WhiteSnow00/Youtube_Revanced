import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbs extends agzi implements ahax
{
    public static final ajbs a;
    private static volatile ahbe c;
    public ajbr b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajbs.class, a = new ajbs());
    }
    
    private ajbs() {
        this.e = 2;
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
                final ahbe c;
                if ((c = ajbs.c) == null) {
                    synchronized (ajbs.class) {
                        if (ajbs.c == null) {
                            ajbs.c = (ahbe)new agzb((agzi)ajbs.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajbs.a;
            }
            case 4: {
                return new agza((agzi)ajbs.a);
            }
            case 3: {
                return new ajbs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbs.a, "\u0001\u0001\u0000\u0001\ue719\u2d5e\ue719\u2d5e\u0001\u0000\u0000\u0001\ue719\u2d5e\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
