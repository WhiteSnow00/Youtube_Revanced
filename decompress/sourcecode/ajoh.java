import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajoh extends agzi implements ahax
{
    public static final ajoh a;
    private static volatile ahbe b;
    private int c;
    private ansi d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajoh.class, (agzi)(a = new ajoh()));
    }
    
    private ajoh() {
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
                final ahbe b2;
                if ((b2 = ajoh.b) == null) {
                    synchronized (ajoh.class) {
                        if (ajoh.b == null) {
                            ajoh.b = (ahbe)new agzb((agzi)ajoh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajoh.a;
            }
            case 4: {
                return new agza((agzi)ajoh.a);
            }
            case 3: {
                return new ajoh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajoh.a, "\u0001\u0001\u0000\u0001\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u1409\u0000", new Object[] { "c", "d" });
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
