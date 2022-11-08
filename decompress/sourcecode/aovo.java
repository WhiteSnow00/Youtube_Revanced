import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovo extends agzi implements ahax
{
    public static final aovo a;
    private static volatile ahbe b;
    private int c;
    private aokb d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aovo.class, a = new aovo());
    }
    
    private aovo() {
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
                final ahbe b2;
                if ((b2 = aovo.b) == null) {
                    synchronized (aovo.class) {
                        if (aovo.b == null) {
                            aovo.b = (ahbe)new agzb((agzi)aovo.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aovo.a;
            }
            case 4: {
                return new agza((agzi)aovo.a);
            }
            case 3: {
                return new aovo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovo.a, "\u0001\u0001\u0000\u0001\ue2d9\u1a6d\ue2d9\u1a6d\u0001\u0000\u0000\u0001\ue2d9\u1a6d\u1409\u0000", new Object[] { "c", "d" });
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
