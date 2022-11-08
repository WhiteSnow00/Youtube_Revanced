import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajml extends agzi implements ahax
{
    public static final ajml a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public ajmd e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ajml.class, (agzi)(a = new ajml()));
    }
    
    private ajml() {
        this.g = 2;
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
                final ahbe f;
                if ((f = ajml.f) == null) {
                    synchronized (ajml.class) {
                        if (ajml.f == null) {
                            ajml.f = (ahbe)new agzb((agzi)ajml.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajml.a;
            }
            case 4: {
                return new agza((agzi)ajml.a);
            }
            case 3: {
                return new ajml();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajml.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
