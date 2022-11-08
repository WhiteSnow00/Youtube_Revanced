import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijc extends agzi implements ahax
{
    public static final aijc a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aijc.class, a = new aijc());
    }
    
    private aijc() {
        this.b = 0;
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
                if ((d = aijc.d) == null) {
                    synchronized (aijc.class) {
                        if (aijc.d == null) {
                            aijc.d = (ahbe)new agzb((agzi)aijc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aijc.a;
            }
            case 4: {
                return new agza((agzi)aijc.a);
            }
            case 3: {
                return new aijc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijc.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u143c\u0000", new Object[] { "c", "b", aorm.class });
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
