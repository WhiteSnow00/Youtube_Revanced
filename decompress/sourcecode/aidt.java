import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidt extends agzi implements ahax
{
    public static final aidt a;
    private static volatile ahbe b;
    private int c;
    private aokb d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aidt.class, (agzi)(a = new aidt()));
    }
    
    private aidt() {
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
                if ((b2 = aidt.b) == null) {
                    synchronized (aidt.class) {
                        if (aidt.b == null) {
                            aidt.b = (ahbe)new agzb((agzi)aidt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aidt.a;
            }
            case 4: {
                return new agza((agzi)aidt.a);
            }
            case 3: {
                return new aidt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidt.a, "\u0001\u0001\u0000\u0001\ue2d9\u1a6d\ue2d9\u1a6d\u0001\u0000\u0000\u0001\ue2d9\u1a6d\u1409\u0000", new Object[] { "c", "d" });
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
