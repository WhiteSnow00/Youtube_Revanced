import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxr extends agzi implements ahax
{
    public static final ajxr a;
    private static volatile ahbe d;
    public int b;
    public amva c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajxr.class, a = new ajxr());
    }
    
    private ajxr() {
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
                final ahbe d;
                if ((d = ajxr.d) == null) {
                    synchronized (ajxr.class) {
                        if (ajxr.d == null) {
                            ajxr.d = (ahbe)new agzb((agzi)ajxr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajxr.a;
            }
            case 4: {
                return new agza((agzi)ajxr.a);
            }
            case 3: {
                return new ajxr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxr.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "b", "c" });
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