import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidl extends agzi implements ahax
{
    public static final aidl a;
    private static volatile ahbe b;
    private int c;
    private aihm d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aidl.class, (agzi)(a = new aidl()));
    }
    
    private aidl() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b2 = aidl.b) == null) {
                    synchronized (aidl.class) {
                        if (aidl.b == null) {
                            aidl.b = (ahbe)new agzb((agzi)aidl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aidl.a;
            }
            case 4: {
                return new agza((agzi)aidl.a);
            }
            case 3: {
                return new aidl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidl.a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007\u1409\t", new Object[] { "c", "d" });
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
