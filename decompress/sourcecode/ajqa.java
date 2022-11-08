import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqa extends agzi implements ahax
{
    public static final ajqa a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajqa.class, (agzi)(a = new ajqa()));
    }
    
    private ajqa() {
        this.b = 0;
        this.e = 2;
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
                if ((d = ajqa.d) == null) {
                    synchronized (ajqa.class) {
                        if (ajqa.d == null) {
                            ajqa.d = (ahbe)new agzb((agzi)ajqa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajqa.a;
            }
            case 4: {
                return new agza((agzi)ajqa.a);
            }
            case 3: {
                return new ajqa();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajqa.a, "\u0001\u0001\u0001\u0000\ue2d9\u1a6d\ue2d9\u1a6d\u0001\u0000\u0000\u0001\ue2d9\u1a6d\u143c\u0000", new Object[] { "c", "b", aokb.class });
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
