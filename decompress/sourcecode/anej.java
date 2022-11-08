import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anej extends agzi implements ahax
{
    public static final anej a;
    private static volatile ahbe b;
    private int c;
    private ameo d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(anej.class, a = new anej());
    }
    
    private anej() {
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
                if ((b2 = anej.b) == null) {
                    synchronized (anej.class) {
                        if (anej.b == null) {
                            anej.b = (ahbe)new agzb((agzi)anej.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return anej.a;
            }
            case 4: {
                return new agza((agzi)anej.a);
            }
            case 3: {
                return new anej();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anej.a, "\u0001\u0001\u0000\u0001\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u1409\u0000", new Object[] { "c", "d" });
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
