import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpu extends agzi implements ahax
{
    public static final ajpu a;
    private static volatile ahbe g;
    public int b;
    public anss c;
    public String d;
    public int e;
    public boolean f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)ajpu.class, (agzi)(a = new ajpu()));
    }
    
    private ajpu() {
        this.h = 2;
        this.d = "";
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
                if ((g = ajpu.g) == null) {
                    synchronized (ajpu.class) {
                        if (ajpu.g == null) {
                            ajpu.g = (ahbe)new agzb((agzi)ajpu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajpu.a;
            }
            case 4: {
                return new agza((agzi)ajpu.a);
            }
            case 3: {
                return new ajpu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpu.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
